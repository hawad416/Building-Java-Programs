	
//Write a recursive method called vowelsToEnd that takes a string as a parameter 
//and returns a string in which all of the vowels have been moved to the end. 
//The vowels should appear in reverse order of what they were in the original word. 
//For example, the call of vowelsToEnd("beautifully") should return "btfllyuiuae".

	public static String vowelsToEnd(String input) {
      if(input == null) throw new IllegalArgumentException("null string :(");

      if(input.length() == 1) return input;

      String result1 = "";
      String result2 = "";

      return vowelsToEnd(input, result1, result2);
	}
	

//method that constructs 2 different strings depending on if a character is a vowel or not 
	private static String vowelsToEnd(String input, String result1, String result2) {
		
      if(input == null) throw new IllegalArgumentException("Null String :(");

    // returns the first nonwoels string to the reversed vowel string!
      if(input.length() == 0) return result1 + result2;

      if(isVowel(input.charAt(0))) {
        result2 = input.charAt(0) + result2;
        return vowelsToEnd(input.substring(1), result1, result2);
      }else {
        result1+=input.charAt(0);
        return vowelsToEnd(input.substring(1), result1, result2);
      }


	}

//determines whether a character is a vowel
	
	private static boolean isVowel(char n) {
		
      if(n == 'a' ||
         n == 'e' ||
         n == 'i' ||
         n == 'o' ||
         n == 'u') return true;

      return false;
	}
	
