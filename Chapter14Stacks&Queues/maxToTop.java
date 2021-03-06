/**Write a method called maxToTop that takes a stack of integers as a parameter and moves the largest 

value in the stack to the top of the stack, leaving all other values in their original order. 

You may assume that the stack does not contain any duplicates. For example, if a stack s stores 

[27, 5, 42, -11, 0, 19], the call of maxToTop(s) should change it to store [27, 5, -11, 0, 19, 42]. 

If the stack is empty, your method should not change it. Use one queue as auxiliary storage.

**/







     	public static void maxToTop(Stack<Integer> s) {

		

		Queue<Integer> q = new LinkedList<Integer>();

		

		if(s.isEmpty()) {

			

		}else {

			

		while(!s.isEmpty()) {

			q.add(s.pop());

		}

	




		int num = q.remove();

		s.push(num);

		







			

		while(!q.isEmpty()) {

			if(q.peek()<num) {

				s.push(q.remove());

			}else {

				num = q.peek();

				s.push(q.remove());

			}

		}

	

		

		while(!s.isEmpty()) {

			if(s.peek()==num) {

				s.pop();

			}else {

				q.add(s.pop());

			}

		}

		

		q.add(num);

	

		

		while(!q.isEmpty()) {

			s.push(q.remove());

		}







		

		}

	}
