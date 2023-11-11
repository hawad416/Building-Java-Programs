


    public void travel(int x, int y) {      
        travel(x, y, "");     
    }

    // EXHAUSTIVE SEARCH

    private void travel(int x, int y, String path) {
    
        if(x == 0 && y == 0 ) {
            System.out.println(path);
        } else if (x >= 0 && y >= 0) {
            
            travel(x - 1, y, path + "E ");
            travel(x, y - 1, path + "N ");
            travel(x - 1, y - 1, path + "NE ");
        }
    }


    // RECURSIVE BACKTRACKING 
    private void travel(int x, int y, List<String> path) {
              
        if(x == 0 && y == 0 ) {
            System.out.println(path);
        } else if (x >= 0 && y >= 0) {
            
            //choose E 
            path.add("E");
            travel(x - 1, y, path);
            path.remove(path.size() - 1);
            
            
            // choose N
            path.add("N");
            travel(x, y - 1, path);
            path.remove(path.size() - 1);
            
            // choose NE
            path.add("NE");
            travel(x - 1, y - 1, path);
            path.remove(path.size() - 1);
            
            
        }
            
    
    }
