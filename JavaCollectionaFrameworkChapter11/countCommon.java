/**Write a method countCommon that takes two Lists of integers as parameters 
and returns the number of unique integers that occur in both lists. Use one or 
more Sets as storage to help you solve this problem.

For example, if one list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] 
and the other list contains the values [-5, 15, 2, -1, 7, 15, 36], your method s
hould return 4 (because the elements -1, 2, 7, and 15 occur in both lists).
*/


    
       public static int countCommon(List<Integer> a, List<Integer> b){
           
              Set<Integer> set = new HashSet<Integer>();
               Set<Integer> set2 = new HashSet<Integer>();
           
              for(int i = 0; i < a.size(); i++){
                  
                      set.add(a.get(i));
              }
           
            for(int i = 0; i < b.size(); i++){
                  
                      set2.add(b.get(i));
              }
           
           
          set.retainAll(set2);
           
           return set.size();
           
       }
