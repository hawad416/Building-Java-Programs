

/**Write a method splitStack that takes a stack of integers as a parameter and splits it into negatives and non-negatives.

The numbers in the stack should be rearranged so that all the negatives appear on the bottom of the stack and all the non-negatives appear on the top. 

In other words, if after this method is called you were to pop numbers off the stack, you would first get all the nonnegative numbers and then get all 

the negative numbers. It does not matter what order the numbers appear in as long as all the negatives appear lower in the stack than all the non-negatives.

You may use a single queue as auxiliary storage.**/










public static void splitStack(Stack<Integer> s){

  

 Queue<Integer> q = new LinkedList<Integer>();

  

   

      while (!s.isEmpty()){

           int n = s.pop();

            q.add(n);

        }

      for(int i=0; i<q.size(); i++){

      int n = q.remove();




      if(n<0){

      s.push(n);   

     

      }  else {

         q.add(n);

         }

        

      } 

     while(!q.isEmpty()){

      s.push(q.remove());

     }

    

}
