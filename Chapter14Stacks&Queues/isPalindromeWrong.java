THIS IS WRONG< ONLY PASSED 9/10 TEST -- THIS SOLUtion IS A DAMN MESS.


REALLY REALLY REALLY HORRIBLE SOLUTION - THIS WAS IN MY BEGINNING DAYS OF COdING. AN UPDATED SOLUTION IS POSTED.



/**Write a method isPalindrome that takes a queue of integers as a parameter and returns true if the numbers in the queue represent 

a palindrome (and false otherwise). A sequence of numbers is considered a palindrome if it is the same in reverse order. For example, 

suppose a queue called q stores these values:




front [3, 8, 17, 9, 17, 8, 3] back

Then the call of isPalindrome(q); should return true because this sequence is the same in reverse order. If the queue had instead stored these values:




front [3, 8, 17, 9, 4, 17, 8, 3] back

The call on isPalindrome would instead return false because this sequence is not the same in reverse order (the 9 and 4 in the middle don't match).

The empty queue should be considered a palindrome. You may not make any assumptions about how many elements are in the queue and your method must 

restore the queue so that it stores the same sequence of values after the call as it did before. You may use one stack as auxiliary storage.

**/







public static boolean isPalindrome(Queue<Integer> q) {

	Stack<Integer> storage = new Stack<Integer>();

	




	int count = 0;




	boolean bool = false;

	int curr = 0;

	int osize = q.size();

	int pop =0;

	

	

if(q.isEmpty()) {

	return true;

}	

	

while(!q.isEmpty()) {

	int move = q.remove();

	storage.push(move);

}

	

while(!storage.isEmpty()) {

	

	int removed = 0;

	Iterator<Integer> itr = storage.iterator();

	if(itr.hasNext()) {

	curr = itr.next();

	removed = curr;

	q.add(removed);

	itr.remove();

	}

	

	if(!storage.isEmpty()) {

		pop = storage.pop();

		

	if(removed== pop) {

		count++;

	}




	}

	

}




if(osize%2==0) {

	q.add(pop);

}




int newSize = q.size();







	if(!q.isEmpty()) {

		

		for(int i=0; i<newSize; i++) {

		int rem = q.remove();

		storage.push(rem);

		q.add(rem);

			if(storage.size()== newSize) {

				storage.pop();

				if(osize%2==0) {

					if(!storage.isEmpty()) {

					storage.pop();

					}

					}

			

			}

		

		}

		

		

	}

	//if(newSize%2==1) {

	while(!storage.isEmpty()) {

		q.add(storage.pop());

	}

	//}

	

	

if(osize%2 == 1) {	

if(count == (osize-1)/2) {

	bool = true;

}else {

	

	bool =false;

}




} else if(osize%2 ==0) {

	if(count == osize/2) {

		bool =true;

}else {

	bool = false;

}

	

	}

return bool;










	




}
