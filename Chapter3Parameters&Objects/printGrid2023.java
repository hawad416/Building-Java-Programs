/*  Write a method named printGrid that accepts two integer parameters rows and cols. The output is a comma-separated grid of numbers where the first parameter (rows) represents the number of rows of the grid and the second parameter (cols) represents the number of columns. The numbers count up from 1 to (rows x cols). The output are displayed in column-major order, meaning that the numbers shown increase sequentially down each column and wrap to the top of the next column to the right once the bottom of the current column is reached. Assume that rows and cols are greater than 0.

Here are some example calls to your method and their expected results: */



public void printGrid(int rows, int cols) {
    
        for (int i = 1; i <= rows; i++) {
            
            int temp = i;        
            System.out.print(temp);
        
                
            for (int j = 1; j < cols; j++ ) {
                temp += rows;             
                System.out.print(", " + temp);                    
            }
            
            System.out.println();
             
        
        }
    }
