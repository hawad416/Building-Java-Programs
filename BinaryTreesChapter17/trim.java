public static NodeClass trim(NodeClass root, int min, int max) {

        if(root == null) return null;

        if(root.val2 <= min) {
          return trim(root.right, min, max);
        }

        if(root.val2 >= max) {
          return trim(root.left, min, max);
        }

        root.left = trim(root.left, min, max);
        root.right =trim(root.right, min, max);

        return root;
	}
