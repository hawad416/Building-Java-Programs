	
	public static void printLevel(NodeClass root, int n) {
	  	
      if(root == null) return;
		  printLevel(root, n , 1);
	}
	
	private static void printLevel(NodeClass root, int n, int level) {
		
      if(n < 1) throw new IllegalArgumentException();

      if(level == n) {
        System.out.println(root.val2);
        return;	
      }


       printLevel(root.left, n, level  + 1);
       printLevel(root.right,n, level + 1);
		 		
		
	}
