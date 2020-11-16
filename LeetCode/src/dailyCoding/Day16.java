package dailyCoding;

import java.util.Arrays;

public class Day16 {
//	This problem was asked by Twitter.
//	You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:
//	record(order_id): adds the order_id to the log
//	get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.
//	You should be as efficient with time and space as possible.
	
	
	// Create a ring buffer/circular queue in the form of an array given fixed size n. 
	// o(n) space 
	// o{1) to record, o{1) to get ith element
	public class Log { 
		private int n;
		private int head;
		private int tail;
		private int[] log; // log is array data structure with fixed size of N
		boolean isFull;

		public Log(int n) {
			this.n = n;
			this.head = this.tail = 0;
			this.log = new int[n];
			this.isFull = false;
		}

		/**
		 * Appends int item to buffer (If buffer is full, oldest entry is replaced)
		 * 
		 * @param int id item to append
		 */
		public void record(int id) {
			if (this.isFull) {
				this.head = (this.head + 1) % this.n;
			}
			this.log[this.tail] = id;
			this.tail = (this.tail + 1) % this.n;
			if (this.tail == this.head) {
				this.isFull = true;
			}
		}

		/**
		 * Gets the ith last element from a log
		 * 
		 * @param int i
		 * @return val at ith index
		 */
		public int getLast(int i) {
			return this.log[this.head - i];
		}
	}

	public static void main(String[] args) {
		Day16 c = new Day16();
		Day16.Log log = c.new Log(6);
		log.record(0);
		log.record(01);
		log.record(012);
		log.record(0123);
		log.record(01234);
		log.record(012345);
		log.record(0123456);
		System.out.println(Arrays.toString(log.log));
	}

}
