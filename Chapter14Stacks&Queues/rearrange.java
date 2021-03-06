/** 

Write a method rearrange that takes a queue of integers as a parameter and rearranges

the order of the values so that all of the even values appear before the odd values and

that otherwise preserves the original order of the list. For example, suppose a queue called q stores this sequence of values:




front [3, 5, 4, 17, 6, 83, 1, 84, 16, 37] back

Then the call of rearrange(q); should rearrange the queue to store the following sequence of values:




front [4, 6, 84, 16, 3, 5, 17, 83, 1, 37] back

Notice that all of the evens appear at the front of the queue followed by the odds and that 

the order of the evens is the same as in the original list and the order of the odds is the same as in the original list. 

You may use one stack as auxiliary storage.




**/







public static void rearrange(Queue<Integer> q){

    Stack<Integer> storage = new Stack<Integer>();

    

    if(!q.isEmpty()){

        int sizer = q.size();

        for(int i=0; i<sizer; i++){

     int n = q.peek();

            

            

     if(n % 2 == 0){

       q.remove(n);

       storage.push(n);

     }else{

         q.remove(n);

         q.add(n);

     }

        }

    }

    while(!q.isEmpty()){

     storage.push(q.remove());

    }

    

    while(!storage.isEmpty()){

        q.add(storage.pop());

    }

    

      while(!q.isEmpty()){

      storage.push(q.remove());

    }

    

     while(!storage.isEmpty()){

        q.add(storage.pop());

    }

    }
