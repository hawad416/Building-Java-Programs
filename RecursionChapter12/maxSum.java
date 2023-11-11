// i think i finally understand backtracking lol
    

public int maxSum(List<Integer> list, int limit) {        
        if(list.size() == 0 || limit < 0) {       
            return 0;
        }
        
        return maxSum(list, limit, 0, 0, 0);    
}

    private int maxSum(List<Integer> list, int limit, int currSum, int maxSum, int index) {      
            if(currSum <= limit) {        
                 maxSum = Math.max(currSum,maxSum); 
            }
        
            if(index >= list.size()) {    
                return maxSum;
            } else {
                //explore without 
                int sumWithout = maxSum(list, limit, currSum, maxSum, index + 1);
    
                int sumWith = maxSum(list, limit, currSum + list.get(index), maxSum, index + 1);
                
              
                return Math.max(sumWith, sumWithout);
        }
               
        
    }


/*
    private int sum(List<Integer> list) {
    
        int sum = 0;
        
        for(Integer n : list) {
            sum+=n;
        }
        
        return sum;
    }

/*
    
    private boolean areNumbersValid(List<Integer> list, int threshold) {
    
        for(Integer n : list) {
            if(n > threshold) return false;
        }
        
        return true; 
    }*/
