/**Write a method isPalindrome that takes a queue of integers as a parameter and returns true if the numbers in the queue represent 

a palindrome (and false otherwise). A sequence of numbers is considered a palindrome if it is the same in reverse order. 

For example, suppose a queue called q stores these values:




front [3, 8, 17, 9, 17, 8, 3] back

Then the call of isPalindrome(q); should return true because this sequence is the same in reverse order. If the queue had instead stored these values:




front [3, 8, 17, 9, 4, 17, 8, 3] back

The call on isPalindrome would instead return false because this sequence is not the same in reverse order 

(the 9 and 4 in the middle don't match). The empty queue should be considered a palindrome. 

You may not make any assumptions about how many elements are in the queue and your method must restore the

queue so that it stores the same sequence of values after the call as it did before. You may use one stack as auxiliary storage.

**/










public static boolean isPalindrome(Queue<Integer> q) {

	

	Stack<Integer> s = new Stack<Integer>();

	boolean bool = true;

	int size = q.size();

	int midNum = 0;

	




		

		//adding half elements to stack

		for(int i=0; i<size/2; i++) {

			s.add(q.remove());

		}

		

		if(size%2 ==1) {

			midNum = q.remove();

	

		}

		

	

		//taking elements from both stacka nd queue and comparing them to each other.

		//if they are not the same, change boolean to false

		//thena dd both numbers into queue

		while(!s.isEmpty()) {

			int num = s.pop();

			int num2 = q.remove();

			

			q.add(num2);

			q.add(num);

				if(num != num2) {

					bool = false;

				}

			

			

		}

		

		//seperating the numbers, some into stack some into queue so i can restore my original queue




		for(int i=0; i<size/2; i++) {

			

			int num = q.remove();

			int num2 = q.remove();

			

			q.add(num);

			s.push(num2);

			

		}

		

		

	

		//taking everything from the stack into the queue

		while(!s.isEmpty()) {

			q.add(s.pop());

		}

		

		if(size%2 ==1) {

			q.add(midNum);

		}

	

		//rotating the queue to get the right order

		for(int i =0; i<size/2;i++) {

			int num = q.remove();

			q.add(num);

		}

	//System.out.println(q);

	

	

	return bool;

}
