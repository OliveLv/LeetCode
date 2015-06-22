package olivelv.medium;

import java.util.Stack;

/**
 * Implement a basic calculator to evaluate a simple expression string.
 * 
 * The expression string contains only non-negative integers, +, -, *, /
 * operators and empty spaces . The integer division should truncate toward
 * zero.
 * 
 * You may assume that the given expression is always valid.
 * 
 * Some examples:
 * 
 * "3+2*2" = 7 " 3/2 " = 1 " 3+5 / 2 " = 5
 * 
 * 
 * BasicCalculatorII.java
 * 
 * @author olivelv
 * @version time: Jun 22, 2015 9:02:13 PM
 */
public class BasicCalculatorII {
	private int doCalculate(int x,int y,String op){
		if(op.equals("+"))return x+y;
		if(op.equals("-"))return x-y;
		if(op.equals("*"))return x*y;
		return x/y;
	}
	private void print(Stack stack){
		int n=stack.size();
		for(int i=0;i<n;i++)
			System.out.println(stack.elementAt(i));
	}
	public int calculate(String s) {
		int n=s.length();
		if(n==0)return 0;
		Stack<Integer> stack=new Stack<Integer>();
		Stack<String>op=new Stack<String>();
		int num=0;
		boolean flag=false;
		for(int i=0;i<n;i++){
			char val=s.charAt(i);
			if(val>='0'&&val<='9'){
				num=num*10+val-'0';
				flag=true;
				continue;
			}
			if(flag)stack.push(num);
			num=0;
			flag=false;
			if(val==' ')continue;
			if(val=='*'||val=='/'){
				while(!op.isEmpty()&&stack.size()>=2){
					String opt=op.peek();
					if(opt.equals("+")||opt.equals("-"))break;
					int x=stack.pop();
					int y=stack.pop();
					op.pop();
					int res=doCalculate(y,x,opt);
					stack.push(res);
				}
			}
			if(val=='+'||val=='-'){
				while(!op.isEmpty()&&stack.size()>=2){
					int x=stack.pop();
					int y=stack.pop();
					String opt=op.pop();
					int res=doCalculate(y,x,opt);
					stack.push(res);
				}
			}
			op.push(String.valueOf(val));
		}
		if(flag)stack.push(num);
		/*print(stack);
		print(op);*/
		while(!op.isEmpty()&&stack.size()>=2){
			int x=stack.pop();
			int y=stack.pop();
			String opt=op.pop();
			int res=doCalculate(y,x,opt);
			stack.push(res);
		}
		return stack.peek();
		
	}
	public static void main(String []args){
		BasicCalculatorII test=new BasicCalculatorII();
		System.out.println(test.calculate("100000000/1/2/3/4/5/6/7/8/9/10"));
		System.out.println(test.calculate(" 3/2 "));
		System.out.println(test.calculate(" 3+5 / 2 "));
	}
}
