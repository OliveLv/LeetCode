package lvxuhong.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time. 
 * • push(x) -- Push element x onto stack. 
 * • pop() --Removes the element on top of the stack. 
 * • top() -- Get the top element. 
 * • getMin() -- Retrieve the minimum element in the stack.
 * 
 * @author xuhong
 *
 */
public class MinStack {
	List<Integer>stack=new ArrayList<Integer>();
	public void push(int x) {
         stack.add(x);
	}

	public void pop() {
		int l=stack.size();
        stack.remove(l-1);
	}

	public int top() {
		int l=stack.size();
		return stack.get(l-1);
       
	}

	public int getMin() {
       int min=Integer.MAX_VALUE;
       for(int ele:stack)
    	   if(ele<min)min=ele;
       return min;
	}
}
