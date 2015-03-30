package olivelv.easy;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * 
 * @author olive
 *
 */
public class ValidParentheses {
	public boolean isValid(String s) {
        Stack<String>stack=new Stack<String>();
        for(int i=0;i<s.length();i++){
        	char x=s.charAt(i);
        	if(x=='('||x=='{'||x=='[')stack.push(String.valueOf(x));
        	if(x==')'||x=='}'||x==']'){
        		if(stack.isEmpty())return false;
        		if((x==')'&&stack.peek().equals("("))||(x=='}'&&stack.peek().equals("{"))||(x==']'&&stack.peek().equals("[")))stack.pop();
        		else{
        			return false;
        		}
        	}
        }
        if(stack.isEmpty())return true;
        return false;
	}
	public static void main(String []args){
		ValidParentheses test=new ValidParentheses();
		System.out.println(test.isValid("()"));
		System.out.println(test.isValid("[](){}"));
		System.out.println(test.isValid("(]"));
	}
}
