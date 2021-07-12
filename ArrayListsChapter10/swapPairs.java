/**Write a method swapPairs that switches the order of values 
in an ArrayList of Strings in a pairwise fashion. 
Your method should switch the order of the first two values,
then switch the order of the next two, switch the order of the next two, and so on. 
For example, if the list initially stores these values:
{"four", "score", "and", "seven", "years", "ago"} 
your method should switch the first pair, "four", "score", 
the second pair, "and", "seven", and the third pair, "years", "ago",
to yield this list: {"score", "four", "seven", "and", "ago", "years"}

If there are an odd number of values in the list, the final element is not moved.
For example, if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"}
It would again switch pairs of values, but the final value, "hamlet" would not be moved, 
yielding this list: {"be", "to", "not", "or", "be", "to", "hamlet"}
*/

public static void swapPairs(ArrayList<String> a) {
			
			int size = a.size();
			
			if(size % 2 ==0) {
				helper(a);
			}else {
				String removed = a.remove(size -1);
				helper(a);
				
				a.add(removed);		
				
			}
		
			
		}
		
		private static void helper(ArrayList<String> b) {
			int size = b.size();
			for(int i = 0; i< size /2; i++) {
				String word1 = b.get(0);
				String word2 = b.get(1);
				
				b.remove(word1);
				b.remove(word2);
				
				b.add(word2);
				b.add(word1);
			}
		}
