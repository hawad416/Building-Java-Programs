/*
Write a method called printSquare that takes in two integer parameters, a min and a max, and prints the numbers in the range from min to max inclusive in a square pattern. The square pattern is easier to understand by example than by explanation, so take a look at the sample method calls and their resulting console output in the table below.

Each line of the square consists of a circular sequence of increasing integers between min and max. Each line prints a different permutation of this sequence. The first line begins with min, the second line begins with min + 1, and so on. When the sequence in any line reaches max, it wraps around back to min.

You may assume the caller of the method will pass a min and a max parameter such that min is less than or equal to max.
  */



public void printSquare(int min, int max) {
       
        for( int i = min; i <= max; i++) {
            
            int temp = i; // 2
            int range = (max - min) + 1;
            
            for(int j = 0; j < range; j++) { // print out some numberes max times
                
                if(temp == max + 1) {   // 6        , temp =2  
                    temp = min;   // 1             
                }
                             
                System.out.print(temp);  //2 3 4 5 1
                temp++;                      
            
            }
            
            System.out.println();
            
        
        }
    }
