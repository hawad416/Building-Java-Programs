/*Write a method hasOdd that takes a Set of integers as a parameter 
and that returns true if the set contains at least one odd integer, and false otherwise. 
If passed the empty set, your method should return false.
*/

  public static boolean hasOdd(Set<Integer> set){
2
        
3
        
4
            if(set.size() == 0){
5
                return false;
7
            }
9
            Iterator<Integer> itr = set.iterator();
11
        
12
            while(itr.hasNext()){
13
                  int num = itr.next();
14
                
15
                  if(num % 2 == 1){
16
                      
17
                        return true;
18
                  }
19
            }
20
        return false;
21
    }
