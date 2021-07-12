/*Write a method removeShorterStrings that takes an ArrayList of Strings
as a parameter and that removes from each successive pair of values the shorter string in the pair. 
For example, suppose that an ArrayList called list contains the following values: 
{"four", "score", "and", "seven", "years", "ago"} In the first pair, "four" and "score", 
the shorter string is "four". In the second pair, "and" and "seven", the shorter string is "and".
In the third pair, "years" and "ago", the shorter string is "ago". Therefore, the call: 
removeShorterStrings(list); should remove these shorter strings, leaving the list as follows:
"score", "seven", "years". If there is a tie (both strings have the same length), your method
should remove the first string in the pair. 
If there is an odd number of strings in the list, the final value should be kept in the list.
*/

	public static void removeShorterStrings(ArrayList<String> a) {
		
		if(a.size()==0) {
			
		}else {
			
			if(a.size()%2==0) {
				
				helper(a);
				
				
			}else {
				
				String rem = a.remove(a.size()-1);
				helper(a);
				a.add(rem);
				
			}
		}
	}
	
	private static void helper(ArrayList<String> b) {
		
		int size = b.size() / 2;
		
		for(int i = 0; i<size; i++) {
			
			String firstWord = b.remove(0);
			String secondWord = b.remove(0);
		
			
			if(firstWord.length()<secondWord.length()) {
				b.add(secondWord);
			}else if(firstWord.length() > secondWord.length()) {
				b.add(firstWord);
			}else {
				b.add(secondWord);
			}
			
		}
	}
