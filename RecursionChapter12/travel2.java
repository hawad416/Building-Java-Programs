
    
    public void travel2(int x, int y) { 
        travel2(x, y, new ArrayList<>());
    }

    // RECURSIVE BACKTRACKING 
    private void travel2(int x, int y, List<String> path) {
              
        if(x == 0 && y == 0 ) {
            System.out.println(path);
        } else if (x >= 0 && y >= 0) {
            
            //choose E 
            path.add("E");
            travel2(x - 1, y, path);
            path.remove(path.size() - 1);
            
            
            // choose N
            path.add("N");
            travel2(x, y - 1, path);
            path.remove(path.size() - 1);
            
            // choose NE
            path.add("NE");
            travel2(x - 1, y - 1, path);
            path.remove(path.size() - 1);
            
            
        }
            
    
    }
