/*
Write a method called printReverse that accepts a String as its parameter and prints the characters in opposite order. For example, a call of printReverse("hello there!"); should print the following output:

!ereht olleh
If the empty string is passed, no output is produced. Your method should produce a complete line of output.
  */


    public void printReverse(String str) {
    
        int len = str.length();
        
        if(len > 0) {
            System.out.print(str.charAt(len - 1));
            printReverse(str.substring(0, len - 1));
        }
    }
