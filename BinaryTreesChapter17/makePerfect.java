	
	public static NodeClass makePerfect(NodeClass root) {
		

      if(root == null) return new NodeClass(0);
      int height = height(root, 0);

      return makePerfect(root, 0, height);
		
		
	}
	
	private static NodeClass makePerfect(NodeClass root,int count, int height) {
		
      if(count == height) return root;

      if(root == null) return new NodeClass(0);

      root.left = makePerfect(root.left, count + 1, height);
      root.right = makePerfect(root.right, count + 1, height);

      return root;
	}
	
	private static int height(NodeClass root, int count) {
		
      if(root == null ) return count;

      return Math.max(height(root.left, count + 1), height(root.right, count + 1));

		
	}
