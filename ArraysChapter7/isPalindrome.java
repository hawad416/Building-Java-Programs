/**Write a method isPalindrome that accepts an array of Strings as its argument 
and returns true if that array is a palindrome (if it reads the same forwards as backwards) 
and false if not. For example, the array {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} 
is a palindrome, so passing that array to your method would return true. 
Arrays with zero or one element are considered to be palindromes.
*/

		public static boolean isPalindrome(String[] a) {
		

		if(a.length == 0 || a == null) {
			return true;
		}else {
		
			int size = a.length - 1;
			
			if(a.length % 2 == 1) {
				for(int i = 0; i< (a.length -1) /2; i++) {
					
					if(a[i] != a[size- i]) {
						return false;
					}
				}
				
			}else{
				
				for(int i = 0; i<a.length /2; i++) {

					if(a[i] != a[size- i]) {
						return false;
					}
				}
			}
			
			return true;
		}
	}
	

/*public static boolean isPalindrome(String[] a) {
		

		if(a.length == 0 || a == null) {
			return true;
		}else {
		
			int size = a.length - 1;
			if(a.length % 2 == 1) {
				for(int i = 0; i< (a.length -1) /2; i++) {
					
					if(a[i] != a[size- i]) {
						return false;
					}
				}
				
			}
			
			return true;
		}
	}*/
