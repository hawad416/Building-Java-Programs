// seems i needed to learn recursive backtracking properly this time lol 

    public void waysToClimb(int n){
     
        Stack<Integer> steps = new Stack<Integer>();
        waysToClimb(n, 0, steps);
    }

// recursive backtracking 1 2023 solution
    
    private void waysToClimb(int n, int sum, Stack<Integer> steps) {
        if(n == 0) return;
    
        if(n == sum){
            System.out.println(steps);
        } else if (sum + 1 <= n || sum + 2 <= n) {
              steps.push(1);
              waysToClimb(n, sum + 1, steps);
              steps.pop();
      
            
              steps.push(2);
              waysToClimb(n, sum + 2, steps);
              steps.pop();
        
        }
             
       
    }



//*recursive backtracking 2 - 2021 solution 

    private void waysToClimb(int n, Stack<Integer> steps){
        
            if(n <=0 ) return;
        
            if(n == 1){
             
                steps.push(1);
                System.out.println(steps);
                steps.pop();
                return;
            }
        
            if(n == 2) {
                    
                steps.push(2);
                System.out.println(steps);
                steps.pop();
            }
        
        steps.push(1);
        waysToClimb(n-1, steps);
        steps.pop();
        
        steps.push(2);
        waysToClimb(n-2, steps);
        steps.pop();
    }
