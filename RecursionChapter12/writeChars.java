
	public static String writeChars(int n) {
		
		if(n < 1) throw new IllegalArgumentException();
		
		if(n==1) return "*";
		if(n == 2) return "**";
		
		String result = "";
		
		result = "<" + writeChars(n-2) + ">";
		
		return result;
		
		
		
	}
	
