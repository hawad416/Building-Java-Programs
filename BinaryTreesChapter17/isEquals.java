	public static boolean isEquals(NodeClass t1, NodeClass t2) {

      if(t1 == null && t2 == null) return true;

      if(t1 == null && t2 != null || t2 == null && t1 != null) return false; //checking size wise basically

      if(t1.val2 == t2.val2) {

        return isEquals(t1.left, t2.left) && isEquals(t1.right, t2.right);

      }

      return false;
	}
