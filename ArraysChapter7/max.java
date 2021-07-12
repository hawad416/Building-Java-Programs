/**Write a method called max that accepts an array of integers
as a parameter and returns the maximum value in the array. For example,
if the array passed stores {12, 7, -1, 25, 3, 9}, your method should return 25. 
You may assume that the array contains at least one element. Your method should not 
modify the elements of the array.*/

public static int max(int[] arr) {
		
		int max = arr[0];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
		
	}
