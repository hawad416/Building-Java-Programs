// wow i re did this problem a year later and found a much simpler algorithm. guess improvemet does exist :) 
// simple two pointer methodology 

     public static boolean isPalindrome(String[] array){
     
         if(array == null) throw new IllegalArgumentException();
         if(array.length == 0 || array.length == 1)return true; 
         
         int i = 0; 
         int j = array.length - 1; 
         
         while(j > i){
         
             if(!(array[i].equals(array[j])))return false;
             
             i++;
             j--;
         }
     
         return true; 
     }
