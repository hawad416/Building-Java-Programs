/** Write a method mirrorHalves that accepts a queue of integers as a parameter and replaces each half of that 

queue with itself plus a mirrored version of itself (the same elements in the opposite order). For example, suppose 

a queue variable q stores the following elements:




front [10, 50, 19, 54, 30, 67] back

After a call of mirrorHalves(q);, the queue would store the following elements:




front [10, 50, 19, 19, 50, 10, 54, 30, 67, 67, 30, 54] back

If your method is passed an empty queue, the result should be an empty queue. If your method is passed a null queue or

one whose size is not even, your method should throw an IllegalArgumentException.




You may use one stack or one queue (but not both) as auxiliary storage to solve this problem. You may not use any other 

auxiliary data structures to solve this problem, although you can have as many simple variables as you like. 

You may not use recursion to solve this problem. For full credit your code must run in O(n) time where n is 

the number of elements of the original queue. Use the Queue interface and Stack/LinkedList classes from lecture.

**/







public static void mirrorHalves(Queue<Integer> q) {

		

		Stack<Integer> s = new Stack<Integer>();

	

	

		if(q == null || q.size()%2 ==1) {

			throw new IllegalArgumentException();

		} else if(q.isEmpty()){

            

          }else {

			int size = q.size();

			for(int i = 0; i< size/2;i++) {

				int num = q.remove();

				s.push(num);

				q.add(num);

			}

			

			while(!s.isEmpty()) {

				q.add(s.pop());

			}

			

		

			for(int i = 0; i< size/2;i++) {

				int num = q.remove();

				s.push(num);

				q.add(num);

			}

			

			while(!s.isEmpty()) {

				q.add(s.pop());

			}

			

		

		}

		

	}
