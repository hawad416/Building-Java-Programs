/**Write a method called vertical that accepts a String as its parameter 
and prints each letter of the string on separate lines. For example, a call 
of vertical("hey now") should produce the following output:

**/

public static void vertical(String s){
    
    String l = "";
    for(int i=0; i<s.length(); i++){
        
        l+=s.charAt(i) + "\n";
    }
    System.out.println(l);
    
   }
