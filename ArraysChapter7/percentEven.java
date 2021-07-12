/*Write a method called percentEven that accepts an array of 
integers as a parameter and returns the percentage of even numbers 
in the array as a real number. For example, if the array stores the elements {6, 2, 9, 11, 3}, 
then your method should return 40.0.
If the array contains no even elements or no elements at all, return 0.0.
*/
	public static double percentEven(int[] a) {
		
		
		if(a == null || a.length == 0) {
			return 0.0;
		}
		double count = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 ==0 ) {
				count++;
			}
		}
		
		if(count == 0) {
			return 0.0;
		}else if(count == a.length){
                return 100.0;
        }{
			return count * 100 / a.length;
		}
	}
