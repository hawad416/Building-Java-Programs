/**Write a method maxOccurrences that accepts a List of integers as a parameter and 
returns the number of times the most frequently occurring integer (the "mode") occurs in the list.
Solve this problem using a Map as auxiliary storage. 
If the list is empty, return 0.
*/
	
	public static int maxOccurrences(List<Integer> list) {
		
        if(list.size() == 0){
            
            return 0;
        }
        
        
		Map<Integer, Integer> occurences = new HashMap<>();
		
		Iterator<Integer> itr = list.iterator();
		
		int count = 1;
		while(itr.hasNext()) {
			int currentNum = itr.next();
			
			
			if(occurences.get(currentNum) != null) {
				occurences.put(currentNum, occurences.get(currentNum)+ 1);
			}else {
				occurences.put(currentNum, count);
			}
		}
		
		Set<Integer> set = new HashSet<>(occurences.values());
		
		return Collections.max(set);
		
	}
