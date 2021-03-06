/** Write a method isSorted that accepts a stack of integers as a parameter and returns true if the elements in 

the stack occur in ascending (non-decreasing) order from top to bottom, and false otherwise. That is, the smallest 

element should be on top, growing larger toward the bottom. For example, passing the following stack to your method should cause it to return true:




bottom [20, 20, 17, 11, 8, 8, 3, 2] top

The following stack is not sorted (the 15 is out of place), so passing it to your method should return a result of false:




bottom [18, 12, 15, 6, 1] top

An empty or one-element stack is considered to be sorted. When your method returns, the stack should be in the same 

state as when it was passed in. In other words, if your method modifies the stack, you must restore it before returning.




Obey the following restrictions in your solution:




You may use one queue or stack (but not both) as auxiliary storage.

You may not use other structures (arrays, lists, etc.), but you can have as many simple variables as you like.

Use the Queue interface and Stack/LinkedList classes discussed in the textbook.

Use stacks/queues in stack/queue-like ways only. Do not call index-based methods such as get, search, or set 

(or use a for-each loop or iterator) on a stack/queue. You may call only add, remove, push, pop, peek, isEmpty, and size.

Your solution should run in O(N) time, where N is the number of elements of the stack.




**/







//approach: basically slowly empty contents of stack into another stack and simultaneously compare each peek. 

//if my boolean value is ever contradicted and set to fasle, then automatically exist the while loop by emptying all contents of stack into storage stack q.

//then restore stack.

// O(N) Runtime Complexity




public static boolean isSorted(Stack<Integer> s){

    

    Stack<Integer> q = new Stack<Integer>();

    boolean bool = true; 

    

        if(s.size() == 1 || s.size() == 0){

           return bool; 

        }else{

           

            

            while(!s.isEmpty()){

            	

            	

            	 q.push(s.pop());

            	 	if(!s.isEmpty()) {

                if( q.peek() <= s.peek() ){

                  bool = true;  

                }else{

                   bool = false; 

                }

                

                if(bool == false) {

                	

                	while(!s.isEmpty()) {

                		q.push(s.pop());

                	}

                }

            	 	}

            

            }

           

            while(!q.isEmpty()){

               s.push(q.pop());

            }

            




            

        }

    

    return bool;

    

    

   

}
