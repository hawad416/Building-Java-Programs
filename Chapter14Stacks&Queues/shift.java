/**Write a method shift that takes a stack of integers and an integer n as para

meters and that shifts n values from the bottom of the stack to the top of the stack. 

For example, if a variable called s stores the following sequence of values:




bottom [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] top 

If we make the call shift(s, 6); the method shifts the six values at the bottom of the

stack to the top of the stack and leaves the other values in the same order producing:




bottom [7, 8, 9, 10, 6, 5, 4, 3, 2, 1] top 

Notice that the value that was at the bottom of the stack is now at the top, the value that was 

second from the bottom is now second from the top, the value that was third from the bottom is now

third from the top, and so on, and that the four values not involved in the shift are now at the bottom of

the stack in their original order. If s had stored these values instead:




bottom [7, 23, -7, 0, 22, -8, 4, 5] top 

If we make the following call: shift(s, 3); then s should store these values after the call:




bottom [0, 22, -8, 4, 5, -7, 23, 7] top 

You are to use one queue as auxiliary storage to solve this problem. You may assume that the parameter

n is >= 0 and not larger than the number of elements in the stack.

**/







public static void shift(Stack<Integer> s, int n){

	

	Queue<Integer> q = new LinkedList<Integer>();

    

	// let this size contain the other numbers BESIDES the n numbers we are shifting

    int size = s.size() - n;

    

    //empty everything into a queue 

    while(!s.isEmpty()) {

    	q.add(s.pop());

    }

    

    // iterate over the numbers which are not apart of the shifted numbers, 

    // and place them into a stack

    for(int i=0; i<size; i++) {

    	s.push(q.remove());

    }

    

    // move the contents of said stack back into the queue so we are somewhat clsoe to the

    //right ordering

    while(!s.isEmpty()) {

    	q.add(s.pop());

    }

    

    // this time iterate n times

    // iterate over the numbers we inten to SHIFT

    //we are rotating the queue just to move our shifted numbers to the end of the queue instead of the front

    for(int i = 0; i<n; i++) {

    	int num = q.remove();

    	q.add(num);

    }

    

    //restore the stack

    while(!q.isEmpty()) {

    	s.push(q.remove());

    }

    

}
