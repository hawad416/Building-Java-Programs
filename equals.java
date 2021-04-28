/**Write a method equals that takes as parameters two stacks of integers and returns true if the two stacks are equal and that returns false otherwise. 

To be considered equal, the two stacks would have to store the same sequence of integer values in the same order. 

Your method is to examine the two stacks but must return them to their original state before terminating. 

You may use one stack as auxiliary storage.




**/







public static boolean equals(Stack<Integer> s1, Stack<Integer> s2){

    

    Stack<Integer> storage = new Stack<Integer>();

    

     int count = 0;

     boolean bool = true;  

    

    if(!s1.isEmpty() && !s2.isEmpty()){

    if(s1.peek() != s2.peek()){

       return false;

    }

    }

    

    

    

    if(s1.size() != s2.size()){

     return false;   

    } else{

        

        while(!s1.isEmpty() && !s2.isEmpty()){

               if(s1.peek()== s2.peek()){

             count++;

               }

           int n = s1.pop();

           int m = s2.pop();

            

           storage.push(n);

           storage.push(m);

            }

        

        }

        

   

             while(!storage.isEmpty()){

              int z = storage.pop();

              int s = storage.pop();

              s2.push(z);

              s1.push(s);

              

            }

            

            if(count ==s1.size()){

            bool = true;

            } else{

            bool = false;

            }

       

      return bool;

    }
