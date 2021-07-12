/*Write a method called mode that returns the most frequently occurring 
element of an array of integers. Assume that the array has at least one element and that every element
in the array has a value between 0 and 100 inclusive. Break ties by choosing the lower value.

For example, if the array passed contains the values {27, 15, 15, 11, 27}, 
your method should return 15. (Hint: You may wish to look at the Tally program from earlier 
in this chapter to get an idea of how to solve this problem.)
*/

    public static int mode(int[] a){
      
        int overallCount = 0;
        int element = 0;
        
        
        for(int i = 0; i < a.length; i++){
         
            int temp = a[i];
            int count = 0; 
            
            for(int j = 0; j < a.length; j++){
              
                if(a[j] == temp){
                   count++;  
                }
            }
            
            if(count > overallCount){
             
                overallCount = count;
                element = temp;
            } else if ( count == overallCount) {
              
                if(temp < element) {
                  
                    element = temp;
                }
            }
            
        }
        
        return element;
    }
