/**Write a method maxLength that takes a Set of strings
as a parameter and that returns the length of the longest
string in the set. If your method is passed an empty set, it should return 0.
*/

    public static int maxLength(Set<String> set){
        
            if(set.size()==0){
                return 0;
            }
        
            int longest = 0;
        
            Iterator<String> itr = set.iterator();
            
        while(itr.hasNext()){
         
            String word = itr.next();
            
            if(word.length() > longest){
                
                longest = word.length();
            }
            
        }
        return longest;
        
    }

