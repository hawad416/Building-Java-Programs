	public static void completeToLevel(NodeClass root, int n) {
        completeToLevel(root, n, 1);
	}
	
	
	private static NodeClass completeToLevel(NodeClass root, int n, int level) {
		
        if(level > n ) return root;

        if(root == null) {
          return new NodeClass(-1);
        }

      root.left =  completeToLevel(root.left, n, level + 1);
      root.right = completeToLevel(root.right, n, level + 1);


      return root;
		
	}
	
