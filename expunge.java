/**Write a method expunge that accepts a stack of integers as a parameter and makes sure that the stack's elements are in non-decreasing

order from top to bottom, by removing from the stack any element that is smaller than any element(s) on top of it. For example, suppose a 

variable s stores the following elements:




bottom [4, 20, 15, 15, 8, 5, 7, 12, 3, 10, 5, 0] top

The element values 3, 7, 5, 8, and 4 should be removed because each has an element above it with a larger value. So the call of expunge(s); 

should change the stack to store the following elements in this order:




bottom [20, 15, 15, 12, 10, 5, 0] top

Notice that now the elements are in non-decreasing order from top to bottom. If the stack is empty or has just one element, nothing changes. 

You may assume that the stack passed is not null.




(Hint: An element e that should be removed is one that is smaller than some element above e. But since the elements above e are in sorted order,

you may not need to examine all elements above e in order to know whether to remove e.)




Obey the following restrictions in your solution:




You may use one queue or stack (but not both) as auxiliary storage. You may not use other structures (arrays, lists, etc.), but you can have as many

simple variables as you like.

Use stacks/queues in stack/queue-like ways only. Do not call index-based methods such as get, search, or set (or for-each) on a stack/queue. 

You may call only add, remove, push, pop, peek, isEmpty, and size.

You have access to the following two methods and may call them as needed to help you solve the problem:

**/










// The method I wrote a month later after much more practice. wow im getting much better at this woohooo










public static void expunge(Stack<Integer> s) {

		Stack<Integer> storage = new Stack<Integer>();

		

    

		if(s.size()==1) { // if size = 1 or is null it does

			

		}else {

		

            

            //takes out the first number in the stack then stores it in a storage

           

          if(!s.isEmpty()) {

			int peekNum = s.pop();

			storage.add(peekNum);

		}

		

		 //compares each peek number in the original stack with each peek number in the storage

         //if the peek number in the original stack is greater than or equal to

         //the peek number in the new stack, it adds it into the new stack.

         

		while(!s.isEmpty()) {

			int remNum = s.pop();

			

			if(remNum>=storage.peek()) {

				storage.add(remNum);

			}

		}

	

            //restores my original stack

	while(!storage.isEmpty()) {

			s.push(storage.pop());

		}

	

	}




}







------------------------------------------------

// THe method I wrote a month before during school, when I was first learning.










 /** expunge() method which takes in a stack as a parameter

     makes sure stack is in ascending order

     removes value that are less than their preceeding values.**/

       

   public static void expunge(Stack<Integer> a ){

   

   //initializing newStack used as auxillary storage.

   Stack<Integer> newStack = new Stack<Integer>();




    int num = a.peek(); // setting num to value at the top of the stack.

    newStack.add(num); // adds that peek value to newstack

    a.pop();           // removes that value from stack a. 

    

    while(!a.isEmpty()){//while there are elements in the stack

    

      if(a.peek()>=newStack.peek()){ //peek of stack a will now continuosly update if a.peek >= newStacks peek. 

         newStack.add(a.peek());  //then we routinley add those peek elements to newStack

         a.pop(); // removes that peek value from a so it can update, and let the next value in the stack take the place of the peek.

      }else if(a.peek()<newStack.peek()){ 

        a.pop();//if a.peek <newStack.peek, it removes it.

                // (LI-FO)is why it compares the new a.peek to the newStack.peek succesfully

       } 

    

    }

    while(!newStack.isEmpty()){ //now we must reverse the order of the stack, so we add them all back into 'a' stack

    a.push( newStack.pop());    // LI-FO guarantees it will reverse and be in the correct order.

  




   

   }

   System.out.println(a);// prints out our updated stack.




}
