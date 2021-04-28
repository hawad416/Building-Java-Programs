/**Write a method compressDuplicates that accepts a stack of integers as a parameter and that replaces each sequence 

of duplicates with a pair of values: a count of the number of duplicates, followed by the actual duplicated number. 

For example, suppose a variable called s stores the following sequence of values:




bottom [2, 2, 2, 2, 2, -5, -5, 3, 3, 3, 3, 4, 4, 1, 0, 17, 17] top

If we make the call of compressDuplicates(s);, after the call s should store the following values:




bottom [5, 2, 2, -5, 4, 3, 2, 4, 1, 1, 1, 0, 2, 17] top

This new stack indicates that the original had 5 occurrences of 2 at the bottom of the stack followed by 2 occurrences of

-5 followed by 4 occurrences of 3, and so on. This process works best when there are many duplicates in a row. For example, if the stack instead had stored:




bottom [10, 20, 10, 20, 20, 10] top

Then the resulting stack after the call ends up being longer than the original:




bottom [1, 10, 1, 20, 1, 10, 2, 20, 1, 10] top

If the stack is empty, your method should not change it. You may use one queue as auxiliary storage to solve this problem.

You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. 

You may not use recursion to solve this problem. For full credit your code must run in O(n) time where n is the number of elements of the original stack.

**/




public static void compressDuplicates(Stack<Integer> s) {

	Queue<Integer> q = new LinkedList<Integer>();

	int count = 1; // initial count starts at 1 because there will always be one occurence of anything in the stack

	

	

	

	while(!s.isEmpty()) {

		q.add(s.pop());

	}

	

	

	

	

	int num = q.remove();  //remove the first number in the q and add back to stack to begin comparison

	s.push(num);

	

	//now checking for how many times a number occurs by comparing the num to peek of the q.

    while(!q.isEmpty()) { 

	if(q.peek() == num) {

		count++;   // incrementing count if the numbers are equal

		q.remove(); //then getting rid of it because we only need one instance of it in the stack

		

		if(q.isEmpty()) {  //this checks if its the last number thats being counted, then makes sure to add the count

			s.push(count);

		}

		

	}else {

		num = q.remove();

		s.push(count);

		s.push(num);

		count = 1;

		

		if(q.isEmpty()) {   //this checks if its the last number thats being counted, then makes sure to add the count

			s.push(count);

		}

		

	}

	

}

	




	while(!s.isEmpty()) {

		q.add(s.pop());

	}

	

	while(!q.isEmpty()) {

		s.push(q.remove()); // restoring the stack

	}







}
