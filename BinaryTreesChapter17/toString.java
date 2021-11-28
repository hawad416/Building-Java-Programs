	
	
public static String toString2(NodeClass root, String result) {
		
      if(root == null) return "empty";
      if(root.left==null && root.right==null) {
        result+=root.val2; 
        return result;
      }else {

        result+=("(" + root.val2+ ", " + toString2(root.left, result) + ", " + toString2(root.right, result) + ")");
      }

      return result;
	}
