/**Write a method named swapPairs that accepts an array of strings as a parameter
and switches the order of values in a pairwise fashion. Your method should switch 
the order of the first two values, then switch the order of the next two, switch
the order of the next two, and so on. For example, if the array initially stores these values:


      
String[] a = {"four", "score", "and", "seven", "years", "ago"};
swapPairs(a);
Your method should switch the first pair ("four", "score"), the second pair ("and", "seven")
and the third pair ("years", "ago"), to yield this array:

{"score", "four", "seven", "and", "ago", "years"}
If there are an odd number of values, the final element is not moved. For example, if the original list had been:

{"to", "be", "or", "not", "to", "be", "hamlet"}
It would again switch pairs of values, but the final value ("hamlet") would not be moved, yielding this list:

{"be", "to", "not", "or", "be", "to", "hamlet"}
You may assume that the array is not null and that no element of the array is null.
*/

	
	public static void swapPairs(String[] a) {
		
		if(a.length % 2 == 0) {
	
			for(int i = 0; i < a.length -1; i+=2) {
				String temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				
			}
		}else {

			for(int i = 0; i < a.length -2; i+=2) {
				String temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
				
			}
		}

		
	}
