
/*Write a method padString that accepts two parameters: a String and an integer representing a length. The method should pad the parameter string with spaces until its length is the given length. For example, padString("hello", 8) should return "   hello". (This sort of method is useful when trying to print output that lines up horizontally.) If the string's length is already at least as long as the length parameter, your method should return the original string. For example, padString("congratulations", 10) would return "congratulations".
  */

 public String padString(String str, int length) {
    
        if(str.length() >= length) return str;
        
        int paddingNeeded = length - str.length();
        
        for(int i = 0; i < paddingNeeded; i++) {
        
             str = " " + str;
        }
        
        return str;
    
    }
