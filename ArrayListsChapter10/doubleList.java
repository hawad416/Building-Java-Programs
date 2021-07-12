/*Write a method doubleList that takes an ArrayList
of Strings as a parameter and that replaces every string with two of that string.
For example, if the list stores the values {"how", "are", "you?"} before the method is called, 
it should store the values
{"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
*/

public static void doubleList(ArrayList<String> a) {
		
		for(int i =0; i< a.size(); i+=2) {
			String word = a.get(i);
			int index = a.indexOf(word);
			
			a.add(index + 1, word);
		}
	}
