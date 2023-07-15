/*Write a method largestAbsVal that accepts three integers as parameters and returns the largest of their three absolute values. For example, a call of largestAbsVal(7, -2, -11) would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.
  */

 public int largestAbsVal(int num1, int num2, int num3) {
    
        // a, b, c 
        // a > b > c -> a > b && a > c 
        
        int a = Math.abs(num1);
        int b = Math.abs(num2);
        int c = Math.abs(num3);
        
        
        if(a >= b && a >= c){
        
            return a; 
        } else if (b >= a && b >=c) {
            return b;
        } else {
            return c;
        }
        
    }
