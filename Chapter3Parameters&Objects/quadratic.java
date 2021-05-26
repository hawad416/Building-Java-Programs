//Write a method called quadratic that solves quadratic equations and prints their roots. 
  //Recall that a quadratic equation is a polynomial equation in terms of a variable x of the form a x2 + b x + c = 0. 


public static void quadratic(int a, int b, int c){
   
    double sqrtNum = Math.sqrt((b*b) - 4*(a)*(c));
    int denomNum = 2*a;
        
    double root1 =(-(b) + sqrtNum) / denomNum;
    double root2 =(-(b) - sqrtNum) / denomNum;
    
    System.out.println("First root = " + root1);
    System.out.println("Second root = " + root2);
    
}
