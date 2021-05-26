/**Write a method largestAbsVal that accepts three integers as parameters and return
s the largest of their three absolute values. For example, a call of largestAbsVal(7, -2, -11)
would return 11, and a call of largestAbsVal(-4, 5, 2) would return 5.
**/

public static int largestAbsVal(int a, int b, int c){
    
    int absA;
    int absB;
    int absC;
    int max = 0;
    
    if(a>=0){
        absA =a;
    }else{
        absA = -(a);
    }
    
    if(absA >= max){
        max = absA;
    }
    
    if(b>=0){
        absB =b;
    }else{
        absB = -(b);
    }
     
    if(absB >= max){
        max = absB;
    }
    
    if(c>=0){
        absC =c;
    }else{
        absC = -(c);
    }
    
     
    if(absC >= max){
        max = absC;
    }
   
    return max;
    
}
