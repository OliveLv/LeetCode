package olivelv.medium;

import java.util.Stack;

/**
 * Implement a basic calculator to evaluate a simple expression string.
 * 
 * The expression string may contain open ( and closing parentheses ), the plus
 * + or minus sign -, non-negative integers and empty spaces .
 * 
 * You may assume that the given expression is always valid.
 * 
 * Some examples:
 * 
 * "1 + 1" = 2 " 2-1 + 2 " = 3 "(1+(4+5+2)-3)+(6+8)" = 23
 * 
 * 
 * BasicCalculator.java
 * 
 * @author olivelv
 * @version time: Jun 10, 2015 8:58:23 AM
 */
public class BasicCalculator {
	public void print(Stack<Integer> stack) {
		System.out.println("begin");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("end");
	}
	// this is a problem
     public int calculate(String s){
    	 Stack<Integer>stack=new Stack<Integer>();
    	 int res=0;
    	 int num=0;
    	 int sign=1;
    	 int n=s.length();
    	 for(int i=0;i<n;i++){
    		 char val=s.charAt(i);
    		 if(val>='0'&&val<='9')num=num*10+val-'0';
    		 if(val=='+'){
    			 res+=sign*num;
    			 num=0;
    			 sign=1;
    		 }
    		 if(val=='-'){
    			 res+=sign*num;
    			 num=0;
    			 sign=-1;
    		 }
    		 if(val=='('){
    			 stack.push(res);
    			 stack.push(sign);
    			 sign=1;
    			 res=0;
    		 }
    		 if(val==')'){
    			 res+=sign*num;
    			 num=0;
    			 res*=stack.pop();
    			 res+=stack.pop();
    		 }
    	 }
    	 if(num!=0)res+=sign*num;
    	 return res;
     }
	 public int calculate1(String s) {
			int n = s.length();
			if (n == 0)
				return 0;
			int num = 0;
			boolean flag = false;
			Stack<String> op = new Stack<String>();
			Stack<Integer> stack = new Stack<Integer>();
			for (int i = 0; i < n; i++) {
				char val = s.charAt(i);
			//	System.out.println(val);
				if (val >= '0' && val <= '9') {
					num = num * 10 + val - '0';
					flag = true;
				} else {
					//System.out.println(num+" "+flag);
					if (flag) {

						while (!op.isEmpty()) {
							String opt = op.peek();
							if (opt.equals("("))
								break;
							if (opt.equals("+")) {
								int x = stack.pop();
								num += x;
								op.pop();
							}
							if (opt.equals("-")) {
								int x = stack.pop();
								num = x - num;
								op.pop();
							}
						}
						if (val == ')')
						{
					//	System.out.println(op.peek());
						op.pop();
						}
						while (!op.isEmpty()) {
							String opt = op.peek();
							if (opt.equals("("))
								break;
							if (opt.equals("+")) {
								int x = stack.pop();
								num += x;
								op.pop();
							}
							if (opt.equals("-")) {
								int x = stack.pop();
								num = x - num;
								op.pop();
							}
						}
					//	System.out.println("stack "+num);
						stack.push(num);
						
						num = 0;
						flag = false;
					}
					if (val != ' ' && val != ')')
					{
					op.push(String.valueOf(val));
					//System.out.println("op "+val);
					}
				}

			}
			if (flag) {
				while (!op.isEmpty()) {
					String opt = op.peek();
					if (opt.equals("("))
						break;
					if (opt.equals("+")) {
						int x = stack.pop();
						num += x;
						op.pop();
					}
					if (opt.equals("-")) {
						int x = stack.pop();
						num = x - num;
						op.pop();
					}
				}
				stack.push(num);
			}
			return stack.peek();
		}
	public int calculate2(String s) {
		if (s.length() == 0)
			return 0;
		Stack<Integer> stack = new Stack<Integer>();
		Stack<String> op = new Stack<String>();
		int n = s.length();
		int num = 0;
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			print(stack);
			char val = s.charAt(i);
			if (val >= '0' && val <= '9') {
				num = num * 10 + val - '0';
				flag = true;
			}
			if (val == ' ' || val == '+' || val == '-' || val == '('
					|| val == ')') {

				if (flag) {
					if (!op.isEmpty()) {
						String opt = op.peek();
						if (opt.equals("+")) {
							int x = stack.pop();
							stack.push(x + num);
							op.pop();
						}
						if (opt.equals("-")) {
							int x = stack.pop();
							stack.push(x - num);
							op.pop();
						}
						if (opt.equals("("))
							stack.push(num);
					}
					if (val == ')')
						stack.push(num);
					num = 0;
					flag = false;
				}
			}
			if (val == '(' || val == '+' || val == '-')
				op.push(String.valueOf(val));
			if (val == ')') {
				op.pop();
				while (!op.isEmpty()) {
					String opt = op.peek();
					if (opt.equals("+")) {
						int x = stack.pop();
						int y = stack.pop();
						stack.push(x + y);
						op.pop();
					}
					if (opt.equals("-")) {
						int x = stack.pop();
						int y = stack.pop();
						stack.push(y - x);
						op.pop();
					}
					if (opt.equals("("))
						break;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		BasicCalculator test = new BasicCalculator();
		String s = "(1+(4+5+2)-3)+(6+8)";
		//String s ="(5-(1+(5)))";
		System.out.println(test.calculate(s));
	}
}
