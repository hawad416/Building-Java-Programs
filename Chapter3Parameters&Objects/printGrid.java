/**Write a method named printGrid that accepts two integer parameters rows and cols.
The output is a comma-separated grid of numbers where the first parameter (rows) represents
the number of rows of the grid and the second parameter (cols) represents the number of columns. 
The numbers count up from 1 to (rows x cols). The output are displayed in column-major order, 
meaning that the numbers shown increase sequentially down each column and wrap to the top of the
next column to the right once the bottom of the current column is reached. Assume that rows and cols are greater than 0.
**/


public static void printGrid(int row, int col) {
		int difference = 0;
		
		
      if(row==1) {
        System.out.print(1);
        for(int i=1; i<col; i++) {
          System.out.print(", " + (i+1));
        }
      }else if(row > 1) {

          if(col>row) {

            difference = col - row;
          }else {
            difference = row;
        }

		
      for(int i=1; i<=row; i++) {
          int start = i+difference;	
          System.out.print(i);

          for(int j=1; j<col;j++) {
            System.out.print(", " + (start));
            start+=difference;
          }
          start = 1 + difference;
          System.out.println();
      }
		
	}
}
