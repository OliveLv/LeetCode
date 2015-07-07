package olivelv.easy;

import java.util.Stack;

/**
 * Implement the following operations of a queue using stacks. • push(x) -- Push
 * element x to the back of queue. • pop() -- Removes the element from in front
 * of queue. • peek() -- Get the front element. • empty() -- Return whether the
 * queue is empty. Notes: •You must use only standard operations of a stack --
 * which means only push to top, peek/pop from top, size, and is empty
 * operations are valid. •Depending on your language, stack may not be supported
 * natively. You may simulate a stack by using a list or deque (double-ended
 * queue), as long as you use only standard operations of a stack. •You may
 * assume that all operations are valid (for example, no pop or peek operations
 * will be called on an empty queue).
 * 
 * ImplementQueueUsingStacks.java
 * 
 * @author olivelv
 * @version time: Jul 7, 2015 8:08:21 AM
 */
class MyQueue {
	Stack<Integer>stack=new Stack<Integer>();
	int peek=0;
	// Push element x to the back of queue.
	public void push(int x) {
		if(stack.isEmpty())peek=x;
		stack.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		Stack<Integer>tmp=new Stack<Integer>();
		while(!stack.isEmpty()){
			tmp.push(stack.pop());
		}
		tmp.pop();
		if(!tmp.isEmpty())peek=tmp.peek();
		while(!tmp.isEmpty()){
			stack.push(tmp.pop());
		}
	}

	// Get the front element.
	public int peek() {
		if(!stack.isEmpty())return peek;
		return -1;
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return stack.isEmpty();
	}
}

public class ImplementQueueUsingStacks {
	public static void main(String []args){
		MyQueue test=new MyQueue();
		test.push(1);
		test.pop();
		System.out.println(test.empty());
	}
}
