/**Write a method called inputBirthday that accepts a Scanner for 
the console as a parameter and prompts the user to enter a month, day,
and year of birth, then prints the birthdate in a suitable format. 
**/

	public static void inputBirthday(Scanner scan){
        
		System.out.print("On what day of the month were you born? ");
		int born = scan.nextInt();
        
		System.out.print("What is the name of the month in which you were born? ");
		String name = scan.next();
		System.out.print("During what year were you born? ");
		int year = scan.nextInt();
	
		System.out.print("You were born on " + name +" " + born + ", " + year +". You're mighty old!");
		


    }
