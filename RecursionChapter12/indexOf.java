
	private static int indexOf(String input1, String input2, int count) {
		
		//potential cases to determine the validity of the operation + base cases
				if(input1 == null || input2 == null) throw new IllegalArgumentException("Null Strings");

				if(input1.length() < input2.length()) return -1;
				if((input1.length() == input2.length()) && input1.charAt(0) != input2.charAt(0)) return -1;
				
				if(input1.substring(0,input2.length()).equals(input2)) {
					return count;		
				}else{
					count++;
					return indexOf(input1.substring(1), input2, count); 
				}
	}


	public static int indexOf(String input1, String input2) {
		
		if(input1 == null || input2 == null) throw new IllegalArgumentException("Null Strings");
		
		return indexOf(input1, input2, 0);
		
	}
