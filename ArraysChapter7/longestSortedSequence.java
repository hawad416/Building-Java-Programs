/**Write a method named longestSortedSequence that accepts an array of integers as a parameter 
and that returns the length of the longest sorted (nondecreasing) sequence of integers in the array.
For example, if a variable named array stores the following values:

int[] array = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
then the call of longestSortedSequence(array) should return 4 because the longest sorted sequence
in the array has four values in it (the sequence -3, 0, 14, 207). Notice that sorted means nondecreasing, 
which means that the sequence could contain duplicates. For example, if the array stores the following values:

int[] array2 = {17, 42, 3, 5, 5, 5, 8, 2, 4, 6, 1, 19}
Then the method would return 5 for the length of the longest sequence (the sequence 3, 5, 5, 5, 8). 
Your method should return 0 if passed an empty array.
*/


 public static int longestSortedSequence(int[] a){
        
        
        if(a.length == 0){
            
            return 0;
            
        } else{
           int highestSequence = 1;
           int count = 1;
        
            
            for(int i = 0; i < a.length -1; i++){
                
                if(a[i] <= a[i+1]){
                 
                    count++;
                    
                    if(count > highestSequence){
                        
                        highestSequence = count;
                    }  
                } else {
                    
                    count = 1; 
                }
                 
            }
        
        return highestSequence;
        }
    }
