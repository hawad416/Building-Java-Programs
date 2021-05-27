/**Write code that prompts the user for a phrase and a number of times to repeat it, 
then prints the phrase that many times. **/

Scanner scan = new Scanner(System.in);

System.out.print("What is your phrase? ");
String phrase = scan.nextLine();

System.out.print("How many times should I repeat it? ");
int times = scan.nextInt();

    for(int i=0; i<times; i++){
        System.out.println(phrase);
    }
