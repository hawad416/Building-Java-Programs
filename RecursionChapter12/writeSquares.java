public static String writeSquares(int n){
     
        String result = "";
        if(n==1) {
            result+="1, ";
        }
        
        else{
        int sqr = n * n;
        
        if(sqr % 2 == 0){
                result = result + ", " + writeSquares(n-1) + sqr;
                
        }else{
                result +=  sqr + writeSquares(n-1) + ", ";
               
               
        }
        
            
        }
        
          return result;
        
    }
	
