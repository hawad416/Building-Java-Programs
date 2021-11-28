//created my own nodeclass which is why i am using it

public static int depthSum(NodeClass root) {
		
      if(root == null) return 0;

      return depthSum(root, 1);
	}
	
	private static int depthSum(NodeClass root, int depth) {
      if(root == null) return 0;

      return root.val2 * depth + depthSum(root.left, depth + 1) + depthSum(root.right, depth + 1); 
	}
	
