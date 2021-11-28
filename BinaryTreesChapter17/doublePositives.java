	
	public static void doublePositives(NodeClass root) {
		
      if(root == null) return;

      if(root.val2 > 0) {
        root.val2*=2;
      }

      doublePositives(root.left);
      doublePositives(root.right);
		
	}
