//Write a method called printReverse that accepts a String as its parameter and prints the characters in opposite order. 
//For example, a call of printReverse("hello there!"); should print the following output:


	public static void printReverse(String s){
	    
        for(int i = s.length()-1; i>=0; i--) {
        	
        	System.out.print(s.charAt(i));
        	
        }
	}
