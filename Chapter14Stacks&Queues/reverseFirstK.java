/**Write a method reverseFirstK that accepts an integer k and a queue of integers as parameters and reverses

the order of the first k elements of the queue, leaving the other elements in the same relative order. 

For example, suppose a variable q stores the following elements:




front [10, 20, 30, 40, 50, 60, 70, 80, 90] back

The call of reverseFirstK(4, q); should change the queue to store the following elements in this order:




front [40, 30, 20, 10, 50, 60, 70, 80, 90] back

If k is 0 or negative, no change should be made to the queue. If the queue passed is null or does not contain at least k elements,

your method should throw an IllegalArgumentException.




For full credit, obey the following restrictions in your solution. A solution that disobeys them can get partial credit.




You may use one queue or stack (but not both) as auxiliary storage.

You may not use other structures (arrays, lists, etc.), but you can have as many simple variables as you like.

Use the Queue interface and Stack/LinkedList classes discussed in lecture.

Use stacks/queues in stack/queue-like ways only. Do not call index-based methods such as get, search, or set (or use a for-each loop) on a stack/queue. 

You may call only add, remove, push, pop, peek, isEmpty, and size.




**/




		public static void reverseFirstK(int k, Queue<Integer> q) {

			

			Stack<Integer> storage = new Stack<Integer>();

			

			

			//base cases for exception

			

			if(q==null || k>q.size()) {

				throw new IllegalArgumentException();

			}

			

			if(k<=0) {

				

			}else {

			

			for(int i=0; i<k; i++) {

				

				storage.push(q.remove());

				

				}

		

			

				while(!storage.isEmpty()) {

					q.add(storage.pop());

				}

			

			

			int size = q.size();

			

			for(int i =0; i<size -k; i++) {

				q.add(q.remove());

			}

			}

		}
