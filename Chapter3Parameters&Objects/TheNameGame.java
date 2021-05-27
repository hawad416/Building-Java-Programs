/**Write a complete program called "TheNameGame", where the user inputs a first and last name and a song in 
the following format is printed about their first, then last, name. Use a method to avoid redundancy.

What is your name? Fifty Cent
Fifty Fifty, bo-Bifty
Banana-fana fo-Fifty
Fee-fi-mo-Mifty
FIFTY!

Cent Cent, bo-Bent
Banana-fana fo-Fent
Fee-fi-mo-Ment
CENT!
**/


public class TheNameGame {

	public static void main(String[] args) {
		
		System.out.println(printSong());

	}
		
	
	public static String fullName(String s) {
		return s + " " + s;
	}
	
	public static String bo(String s) {
		
		return "bo-B" + s.substring(0+1, s.length());
	}
	
	public static String fo(String s) {
		 return "fo-F" + s.substring(0+1, s.length());
	}
	
	public static String giant(String s) {
		
		return "Fee-fi-mo-M" + s.substring(0+1, s.length());
	}
	
	public static String excitement(String s) {
		return s.toUpperCase()+ "!";
	}
	
	public static String banana(String s) {
		return "Banana-fana " + fo(s);
	}
	
	public static String printSong() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = scan.nextLine();
		
		String first = name.substring(0, name.indexOf(' '));
		String last = name.substring(name.indexOf(' ') + 1, name.length());
		
		
		String firstStanza = fullName(first) + ", " + bo(first) + "\n"
				+ banana(first) + "\n" + giant(first) + "\n" + excitement(first);
	
		
		String secondStanza = fullName(last) + ", " + bo(last) + "\n"
				+ banana(last) + "\n" + giant(last) + "\n" + excitement(last);
		
		return firstStanza + "\n\n" + secondStanza;
	}



	
}
