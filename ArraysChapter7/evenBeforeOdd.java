/**Write a method called evenBeforeOdd that accepts an array of
integers and rearranges its elements so that all even values appear before all odds.
For example, if the array is [5, 4, 2, 11, 9, 10, 4, 7, 3], then after the method has been called,
one acceptable ordering of the elements would be [4, 2, 10, 4, 5, 11, 9, 7, 3].
The exact order of the elements does not matter, so long as all even values appear before all odd values.
The array might contain no even elements or no odd elements. 
Do not use any temporary arrays in your solution, and do not call Arrays.sort.
*/


	public static void evenBeforeOdd(int[] a) {
	
		int start = 0;
		
		for(int i = 0; i<a.length; i++) {
			if(a[i] % 2 ==0) {
				int temp = a[i];
				a[i] = a[start];
				a[start] = temp;
				start++;
			}
		}
		
	}
