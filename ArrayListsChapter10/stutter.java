/*Write a method stutter that takes an ArrayList of Strings and 
an integer k as parameters and that replaces every string with k copies of that string. 
For example, if the list stores the values ["how", "are", "you?"] before the method 
is called and k is 4, it should store the values
["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?", "you?"] 
after the method finishes executing.
If k is 0 or negative, the list should be empty after the call.
*/


	public static void stutter(ArrayList<String> a, int k) {
		if(k == 0 || k < 0) {
			a.clear();
		}else {
			
			int size = a.size();
			
			for(int i = 0; i< size; i++) {
				String word = a.get(i);
				
				for(int j=0; j<k; j++) {
					a.add(word);
				}
				
			
			}
			
			for(int i = 0; i< size; i++) {
			
				a.remove(0);
			
			}
			
			System.out.println(a);
			
		}
	}
