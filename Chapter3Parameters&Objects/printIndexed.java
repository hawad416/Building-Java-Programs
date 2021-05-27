
/**
Write a method called printIndexed that accepts a String as 
its parameter and prints the String's characters in order
followed by their indexes in reverse order. For example, the call 
of printIndexed("ZELDA"); should print Z4E3L2D1A0 to the console.
**/

public static void printIndexed(String s) {
		
		int indexes = s.length() -1 ;
		
		String nums = "";
		
		for(int i=indexes; i>=0; i--) {
			nums+=i;
		}
		
		
		
		String newS = "";
		for(int i=0; i<s.length(); i++) {
			newS+=s.charAt(i);
			newS+=nums.charAt(i);
		}
		
		System.out.println(newS);
	}
