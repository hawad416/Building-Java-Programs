	
	public static int digitMatch(int input1, int input2) {
		
		
		if(input1 < 0 || input2 < 0) {
			throw new IllegalArgumentException();
		}
		
		if(input1 == 0 || input2 == 0) {
			return 1;
		}

		
		String string1 = Integer.toString(input1);
		String string2 = Integer.toString(input2);
		
		
		
		int modInput1 = 0; 
		int modInput2 = 0;
		
		if(string1.length() > 1) {
			modInput1 = Integer.parseInt(string1.substring(0,string1.length() - 1 ));
		}else {
			return digitMatch(0,0);
		}
		
		if(string2.length() > 1) {
			modInput2 = Integer.parseInt(string2.substring(0,string2.length() - 1 ));
		}else {
			return digitMatch(0,0);
		}
		
		
		if(string1.charAt(string1.length() - 1) == string2.charAt(string2.length() -1)) {
			
			
			return 1 + digitMatch(modInput1, modInput2);
		}
		
		 	return 0 + digitMatch(modInput1, modInput2);
	}
