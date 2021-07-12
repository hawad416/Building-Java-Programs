/*Write a method averageLength of code that computes and returns the average
String length of the elements of an array of Strings. For example, 
if the array contains {"belt", "hat", "jelly", "bubble gum"}, the average
length returned should be 5.5. Assume that the array has at least one element.
*/

	public static double averageLength(String[] a) {
		
		double diffLengths = 0;
		for(int i = 0; i<a.length; i++) {
			diffLengths+=a[i].length();
		}
		
		double average = diffLengths / a.length;
		
		return average;
		
	}
