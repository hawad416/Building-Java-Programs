    static int product = 1;

    public static int multiplyEvens(int n) {

        if(n <= 0) throw new IllegalArgumentException();
        int endRange = n * 2;

        return multiplyEvens2(1, endRange);
  	}
	
	  private static int multiplyEvens2(int n, int m) {
		
        if(n<1) throw new IllegalArgumentException("Invalid start range");
      
        if(n >= (m+1)){
          return 1;
        }

        if(n%2 == 0) {
          product = n;
          return product * multiplyEvens2(n+2, m);
        }else {
          return multiplyEvens2(n+1, m);

        }
      
    }

