/**Write a method removeEvenLength that takes an ArrayList of Strings as
a parameter and that removes all of the strings of even length from the list.
*/

public static void removeEvenLength(ArrayList<String> a) {
		
		int placeHolder;
		
		for(int i=0; i< a.size(); i++) {
			
			placeHolder = i -1;
			
			if(a.get(i).length()%2==0) {
				a.remove(i);
				i = placeHolder;
			}
        }
        
    }
