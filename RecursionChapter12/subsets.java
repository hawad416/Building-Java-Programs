     public void subsets(List<String> list) {
         subsets(list, 0, new ArrayList<String>());
     }

    private void subsets(List<String> list, int index, List<String> result) {
    
        if(index >= list.size()){
            System.out.println(result);
        } else {
            
            // dont include the number 
            subsets(list, index + 1, result);
        
            // include the number 
            result.add(list.get(index));
            subsets(list, index + 1, result);
            result.remove(result.size() - 1); // this is necessary because even though this is the call to include it, we still have to backtrack from here to include other stuff
                                              // which is why we need to restore the state of our list. got it! 
                                              // i was confused becuase I was like we already have the call to NOT include the number on line 12, so why do i need to remove the number here. 
            
        }
    
    
    }
