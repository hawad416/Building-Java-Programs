    
    public void waysToClimb(int n) {
    
        waysToClimb(n, 0, new Stack<Integer>());
    
    }


    // RECUSRIVE BACKTRACKING
    private void waysToClimb(int n, int sum, Stack<Integer> steps) {
        
        if(n == 0) return;
    
        if(sum == n) {
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

    // EXHAUSTIVE SEARCH
    private static void waysToClimb(int n, int position, String result) {
    if (n == position) {
        int index = result.lastIndexOf(",");
        if (index != -1) {
            result = result.substring(0, index) + "]";
            System.out.println(result);
        }
    } else if (n > position) {
        waysToClimb(n, position + 1, result + "1, ");
        waysToClimb(n, position + 2, result + "2, ");
    }
}
