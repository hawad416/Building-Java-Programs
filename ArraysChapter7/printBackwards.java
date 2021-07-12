/**Write a method printBackwards that prints an array of integers in reverse order, in the following format.*/

	public static void printBackwards(int[] arr) {
		for(int i = arr.length-1; i>=0; i--) {
			System.out.println("element [" + i + "] is " + arr[i]);
		}
		
	}
