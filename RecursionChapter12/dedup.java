	public static String dedup(String n) {
		
		if(n == null) throw new IllegalArgumentException("Please Enter a Non Null String");
		
		String result = "";
		return dedup(n, n.length()-1,result);
	}
	


//working backwards from last character in string to the first character checking if the character befor ethe last is the same. if it is, then keep going backwards
//recursively. If its not the same, then append the current result to that character. 
	private static String dedup(String input, int index, String result) {
		
		if(input== null) throw new IllegalArgumentException();
		
		if(input == "" || index == 0 ) {
			result = input.charAt(0) + result;
			return result;
		}
	
		
	
			if(input.length() > 1 && input.charAt(index) == input.charAt(index - 1)) {
				return dedup(input.substring(0,index), index-1, result);
			} else {
				result= input.charAt(index) + result;
				return dedup(input.substring(0, index), index -1, result);
			}
	
	}
