public static boolean isFull(NodeClass root) {
      if(root == null) return true;


      boolean isZero = root.right == null && root.left == null;
      boolean isTwo  = root.right != null && root.left != null;

      if (isZero || isTwo) {
        return isFull(root.left) && isFull(root.right);

      }

      return false;
		
	}
	
	
