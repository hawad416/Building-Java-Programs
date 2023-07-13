// MY ATTEMPT of evenDigits from 2 years ago lol (it only passed 4/10 tests and is a crazy solution! going to try again 2023 and see what i can come up with

	public static int evenDigits(int num) {
		
		String result = "";
		return evenDigits(num, result);
	}
	

	
	// LMAOOOOOO this is brute force to the maxxxxx, but its the effort that counts! 
	private static int evenDigits(int num, String result) {
		
		String numString;
		boolean flag = false;
		
		if(num == 0 ) return Integer.parseInt(result);
		if(num < 0 ) {
			flag = true;
			numString = Integer.toString(num).substring(1);
		}else {
			numString = Integer.toString(num);
		}
		
		//convert original number to string, I think ill pass this in the actual func
		
		
		if(numString.length() < 1) {
			if(result == "") return 0;
			if(flag) {
				return Integer.parseInt('-' + result);
			}else {
				return Integer.parseInt(result);
			}
			
		}
		
		String updatedNum = numString.substring(1);
		
		if(numString.charAt(0) % 2 == 0) {
			result+= numString.charAt(0);
			
			if(updatedNum.length() > 0) {
				return evenDigits(Integer.parseInt(updatedNum), result);
			}else {
				return evenDigits(0, result);
			}
			
		}else {
			if(updatedNum == "") return evenDigits(0, result);
			return evenDigits(Integer.parseInt(updatedNum), result);
		}
		
	}
