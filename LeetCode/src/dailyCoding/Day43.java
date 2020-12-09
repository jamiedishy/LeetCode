package dailyCoding;

import java.util.*;

public class Day43 {
//	This problem was asked by Amazon.
//	Implement a stack that has the following methods:
//	push(val), which pushes an element onto the stack
//	pop(), which pops off and returns the topmost element of the stack. If there are no elements in the stack, then it should throw an error or return null.
//	max(), which returns the maximum value in the stack currently. If there are no elements in the stack, then it should throw an error or return null.
//	Each method should run in constant time.
	
	
	public class MyStack {
		int max;
		LinkedList<Integer> list = new LinkedList<>(); // can it be integers? how do use generic property in java?
		Stack<Integer> stack = new Stack<>();
		
		public MyStack() {}
		
		public void push(int val) {
			list.add(val);
			if (val > this.max) {
				this.max = val;
			}
			this.stack.push(this.max);
		}
		
		public Integer pop() {
			if (this.list.size() > 0) {
				int val = this.list.getLast();
				this.stack.pop();
				this.max = this.stack.lastElement();
				return val;
			} else {
				return null;
			}
		}
		
		public Integer max() {
			return this.max;
		}
		
	}

}
