public static int countEvenBranches(IntTreeNode root) {
      if(root == null) return 0;

      if(root.left != null && root.right != null) {
        return 1 + countEvenBranches(root.left) + countEvenBranches(root.right);
      }

      return countEvenBranches(root.left) + countEvenBranches(root.right);
	}
