/**Write a method priceIsRight that accepts an array of integers bids and an 
integer price as parameters. The method returns the element
in the bids array that is closest in value to price without being larger than price. 
For example, if bids stores the elements {200, 300, 250, 999, 40}, then priceIsRight(bids, 280) 
should return 250, since 250 is the bid closest to 280 without going over 280. 
If all bids are larger than price, then your method should return -1.

The following table shows some calls to your method and their expected results:

Arrays	Returned Value
int[] a1 = {900, 885, 989, 1};	priceIsRight(a1, 800) returns 1
int[] a2 = {200};	priceIsRight(a2, 120) returns -1
int[] a3 = {500, 300, 241, 99, 501};	priceIsRight(a3, 50) returns -1
You may assume there is at least 1 element in the array, and you may assume 
that the price and the values in bids will all be greater than or equal to 1. 
Do not modify the contents of the array passed to your method as a parameter.
*/

	
	public static int priceIsRight(int[] a, int price) {
		
		int[] copy = Arrays.copyOf(a, a.length);
		Arrays.sort(copy);
		
	
		int result;
		int count = 0;
        
        
		for(int i=0; i < copy.length; i++) {
			if(copy[i] > price) {
				count++;
			}
		}
		if(count == copy.length) {
			return -1;
		}
        
      
		int stop = copy.length;
		
		for(int i = 0; i< copy.length; i++) {
			if(copy[i] > price) {
				stop = i;
				break;
			}
		}
		result = copy[stop-1];
		
	
		return result;
		
	
	}
