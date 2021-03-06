/** Write a method mirror that accepts a stack of integers as a parameter and replaces the stack 

contents with itself plus a mirrored version of itself (the same elements in the opposite order). 

For example, suppose a variable s stores the following elements:




bottom [10, 50, 19, 54, 30, 67] top

After a call of mirror(s);, the stack would store the following elements (underlined for emphasis):




bottom [10, 50, 19, 54, 30, 67, 67, 30, 54, 19, 50, 10] top

Note that the mirrored version is added on to the top of what was originally in the stack.

The bottom half of the stack contains the original numbers in the same order. If your method is passed an empty stack, 

the result should be an empty stack. If your method is passed a null stack, your method should throw an IllegalArgumentException.




You may use one stack or one queue (but not both) as auxiliary storage to solve this problem. 

You may not use any other auxiliary data structures to solve this problem, although you can have as many simple variables as you like. 

You may not use recursion to solve this problem. For full credit your code must run in O(n) time where n is the number of elements of the original stack. 

Use the Queue interface and Stack/LinkedList classes from lecture.




**/




public static void mirror(Stack<Integer> s){

    Queue<Integer> q = new LinkedList<Integer>();




    

    if(s == null){

        throw new IllegalArgumentException();

        

      } else if(s.size() == 0){

        

    }else{

      int size = s.size();

    

    for(int i = 0; i<size; i++){

       int num = s.pop();

        q.add(num);

       // s.push(num);

    }

    

    for(int i=0; i<size; i++) {

    		int num = q.remove();

    		q.add(num);

    		s.push(num);

    }

    

    while(!q.isEmpty()) {

    	s.push(q.remove());

    }

    

    while(!s.isEmpty()) {

    		q.add(s.pop());

    }

    

    while(!q.isEmpty()) {

    		s.push(q.remove());

    }

    

    for(int i = 0; i<size; i++) {

    		q.add(s.pop());

    }

    

    while(!q.isEmpty()) {

    		s.push(q.remove());

    }

  

    }

}
