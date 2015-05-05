package olivelv.easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time. 
 * �?push(x) -- Push element x onto stack. 
 * �?pop() --Removes the element on top of the stack. 
 * �?top() -- Get the top element. 
 * �?getMin() -- Retrieve the minimum element in the stack.
 * 
 * @author olive
 *
 */
public class MinStack {
	Stack<Integer>stack=new Stack<Integer>();
	Queue<Integer>minstack=new PriorityQueue<Integer>();
	public void push(int x) {
		minstack.add(x);
         stack.push(x);
	}

	public void pop() {
		int val=stack.pop();
		if(minstack.peek()==val){
			minstack.poll();
		}   
	}
	public int top() {
		return stack.peek();
	}

	public int getMin() {
       return minstack.peek();
	}
}
