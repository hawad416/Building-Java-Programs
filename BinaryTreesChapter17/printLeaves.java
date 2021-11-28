//print leaves of tree from right to left

public static void printLeaves(NodeClass root) {
      if(root == null) {
        System.out.println("no leaves");
        return;
      }

      if(root.right == null && root.left == null) {
        System.out.print(root.val2 + ", ");
        return;
      }

      printLeaves(root.right);
      printLeaves(root.left);
	}
