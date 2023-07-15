
//PLEASE GO LOOK AT MY 2021 VERSION LOLLLLL the improvement is real


/*
Write a complete program called "TheNameGame", where the user inputs a first and last name and a song in the following format is printed about their first, then last, name. Use a method to avoid redundancy.

What is your name? Fifty Cent
Fifty Fifty, bo-Bifty
Banana-fana fo-Fifty
Fee-fi-mo-Mifty
FIFTY!

Cent Cent, bo-Bent
Banana-fana fo-Fent
Fee-fi-mo-Ment
CENT!
  */

 public class TheNameGame {         
        
        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
		
            System.out.print("What is your name? ");
            String[] fullName = scan.nextLine().split(" ");
            
            craftSong(fullName[0]);
            System.out.println();
            craftSong(fullName[1]);
        
        }
              
        
        // helper method used to craft a song given the name.
        public static void craftSong(String name) {
        
            System.out.println(name + " " + name + ", bo-" + morphName(name, 'B'));
            System.out.println("Banana-fana fo-" + morphName(name, 'F'));
            System.out.println("Fee-fi-mo-" + morphName(name, 'M'));
            System.out.println(name.toUpperCase() + "!");                           
                
        }
        
        // helper method to morph the first character of each name
        // to fit accordingly with the lyrics of our song.
        private static String morphName(String name, char letter) { 
            name = letter + name.substring(1);
            return name;
        }  
    
    }
