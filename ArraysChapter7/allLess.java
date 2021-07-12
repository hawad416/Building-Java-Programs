/**Write a method called allLess that accepts two arrays of integers and returns true if each element 
in the first array is less than the element at the same index in the second array.

For example, if the two arrays passed are {45, 20, 300} and {50, 41, 600}, 
your method should return true. If the arrays are not the same length, you should return false.*/

	public static boolean allLess(int[] a, int[] b) {
		
		if(a.length != b.length) {
			return false;
		} else {
			
			for(int i = 0; i< a.length; i++) {
				for(int j = 0; j < b.length; j++) {
					if(a[i] > b[i]) {
						return false;
					}
				}
			}
			
		}	
		
		return true;
	}
