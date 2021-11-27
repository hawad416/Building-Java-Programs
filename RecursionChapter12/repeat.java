  //expensive operation


public static String repeat(String s, int n ){
            
        if (n < 0 ) throw new IllegalArgumentException();
        
        if(n == 0) return "";
        
        return s + repeat(s, n-1);
        
    }


//less expensive operation

public String repeat(String str, int n) {
    if(n < 0)
        throw new IllegalArgumentException();
        
    if(n == 0)
        return "";
        
    String half = repeat(str, n / 2);
    
    if(n % 2 == 0)
        return half + half;
        
    return str + half + half;
}
