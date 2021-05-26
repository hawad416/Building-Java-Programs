//Write a method called distance that accepts four
//integer coordinates x1, y1, x2, and y2 as parameters and computes the distance between points (x1, y1) and (x2, y2) on the Cartesian plane.




public static double distance(double x1,double y1, double x2, double y2){
    
    return Math.sqrt(((x2 - x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
}
