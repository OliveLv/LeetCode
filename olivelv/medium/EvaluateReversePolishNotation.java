package olivelv.medium;

import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or another
 * expression.
 * 
 * Some examples:
 * 
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9 
 * ["4", "13", "5", "/", "+"] ->(4 + (13 / 5)) -> 6
 * 
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月2日 下午6:49:54
 */
public class EvaluateReversePolishNotation {
	private int getVal(String s){
		int val=0;
		int flag=1;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='0'&&c<='9')val=val*10+c-'0';
			else
				if(c=='-')flag=flag*-1;
		}
		return flag*val;
	}
	 public int evalRPN(String[] tokens) {
	        Stack<String>stack=new Stack<String>();
	        for(int i=0;i<tokens.length;i++){
	        	if(tokens[i].equals("+")){
	        		int a=getVal(stack.pop());
	        		int b=getVal(stack.pop());
	        		stack.push(String.valueOf(a+b));
	        	}else
	        		if(tokens[i].equals("-")){
	        			int a=getVal(stack.pop());
		        		int b=getVal(stack.pop());
		        		stack.push(String.valueOf(b-a));
	        		}else if(tokens[i].equals("*")){
	        			int a=getVal(stack.pop());
		        		int b=getVal(stack.pop());
		        		stack.push(String.valueOf(a*b));
	        		}else if(tokens[i].equals("/")){
	        			int a=getVal(stack.pop());
		        		int b=getVal(stack.pop());
		        		stack.push(String.valueOf(b/a));
	        		}else
	        			stack.push(tokens[i]);
	        }
	        return getVal(stack.pop());
	    }
	 public static void main(String []args){
		 String []str={"2", "1", "+", "3", "*"};
		 EvaluateReversePolishNotation test=new EvaluateReversePolishNotation();
		 System.out.println(test.evalRPN(str));
	 }
}
