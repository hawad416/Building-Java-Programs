/**Write a method called removeInRange that accepts four parameters:
a List of integers, an element value, a starting index, and an ending index. 
The method's behavior is to remove all occurrences of the given element that appear
in the list between the starting index (inclusive) and the ending index (exclusive). 
Other values and occurrences of the given value that appear outside the given index range are not affected.

For example, for the list (0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16), a call 
of removeInRange(list, 0, 5, 13) should produce the list (0, 0, 2, 0, 4, 6, 8, 10, 12, 0, 14, 0, 16). 
Notice that the zeros located at indices between 5 inclusive and 13 exclusive in the original
list (before any modifications were made) have been removed.
*/

	
	public static void removeInRange(List<Integer> list,int target, int start, int end) {
		Iterator<Integer> itr = list.iterator();
		int count = 0;
		
		while(itr.hasNext()) {
		 int rem = itr.next();
		
			
			if(count >= start && count < end) {
					
				if(rem == target) {
				itr.remove();	
				
			}
				
               
			}
            	count++;
		}
		
		System.out.println(list);
		
	}
