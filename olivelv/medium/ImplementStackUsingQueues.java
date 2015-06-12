package olivelv.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement the following operations of a stack using queues. 
 * • push(x) -- Push element x onto stack. 
 * • pop() -- Removes the element on top of the stack. 
 * • top() -- Get the top element. 
 * • empty() -- Return whether the stack is empty.
 * Notes: 
 * •You may assume that all operations are valid (for example, no pop or
 * top operations will be called on an empty stack). 
 * •Depending on your language, queue may not be supported natively. You may simulate a queue by
 * using a list or deque (double-ended queue), as long as you use only standard
 * operations of a queue -- which means only push to back, pop from front, size,
 * and is empty operations are valid.
 * 
 * ImplementStackUsingQueues.java
 * 
 * @author olivelv
 * @version time: Jun 11, 2015 1:27:02 PM
 */
class MyStack {
	Queue<Integer>queue=new LinkedList<Integer>();
	// Push element x onto stack.
	public void push(int x) {
		queue.add(x);
	}

	// Removes the element on top of the stack.
	public void pop() {
		int n=queue.size();
		int []tmp=new int[n];
		int k=0;
		while(!queue.isEmpty()){
			tmp[k++]=queue.poll();
		}
		for(int i=0;i<n-1;i++)queue.add(tmp[i]);
	}

	// Get the top element.
	public int top() {
		int n=queue.size();
		int []tmp=new int[n];
		int k=0;
		while(!queue.isEmpty()){
			tmp[k++]=queue.poll();
		}
		for(int i=0;i<n;i++)queue.add(tmp[i]);
		return tmp[n-1];
	}

	// Return whether the stack is empty.
	public boolean empty() {
		return queue.isEmpty();
	}
}

public class ImplementStackUsingQueues {

}
