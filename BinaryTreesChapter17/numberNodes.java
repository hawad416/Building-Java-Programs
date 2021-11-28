public static void numberNodes(NodeClass root) {
      if(root == null) return;

      numberNodes(root, 1);
      }

      static int currentNum = 0;

      private static void numberNodes(NodeClass root, int num) {

        if(root == null) return;

        root.val2 = num;
        currentNum = num;

        numberNodes(root.left,num + 1);

        numberNodes(root.right, currentNum + 1);
	}
	
