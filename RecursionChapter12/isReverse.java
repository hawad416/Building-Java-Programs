	public static boolean isReverse(String input1, String input2) {
		
		if(input1.isEmpty() && input2.isEmpty()) return true;
		
		if(input1.length() != input2.length()) return false;
		
		String reversedString = reverseStr(input1);
		
		return reversedString.toLowerCase().equals(input2.toLowerCase());
	}
	
	private static String reverseStr(String str) {
		
		if(str.length() == 1) return str;
		
		return str.charAt(str.length() - 1) + reverseStr(str.substring(0, str.length() - 1));
	}
