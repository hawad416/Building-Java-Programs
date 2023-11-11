
    public void countBinary(int n) {
        
        countBinary(n, "");
        
    }


    // EXHAUSTIVE SEARCH 
    private void countBinary(int n, String soFar) {
    
        if(n == 0) {
            System.out.println(soFar);
        } else if (n > 0) {     
           countBinary(n - 1, soFar + "0");
           countBinary(n-1, soFar + "1");
        
        }
    }



    // BACKTRACKING 
    private void countBinary(int n, String soFar){
        
       if(n == 0) {
           System.out.println(soFar);
       } else if(n > 0) {
           
           soFar = soFar + "0";
           countBinary(n - 1, soFar);          
           soFar = soFar.substring(0, soFar.length() - 1);
           
           soFar = soFar + "1";
           countBinary(n - 1, soFar);          
           soFar = soFar.substring(0, soFar.length() - 1);
           
       }
    
    }
