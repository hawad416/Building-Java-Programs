/**Write a method contains3 that accepts a List of strings as a parameter 
and returns true if any single string occurs at least 3 times in the list,
and false otherwise. Use a map as auxiliary storage.
*/

   public static boolean contains3(List<String> list){
        
            Map<String, Integer> map = new HashMap<>();
        
            Iterator<String> itr = list.iterator();
        
            int count = 1;
        
            while(itr.hasNext()){
                
                String word = itr.next();
                
                if(map.get(word) != null){

                    map.put(word, count);
                           count++;
                    
                       if(map.get(word) == 3){
                  
                    return true;
                    
               }
                }else{
                    map.put(word, count);
                }   
            }
        
        return false;
        
    }
