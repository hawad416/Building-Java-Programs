public static int countEmpty(NodeClass overallRoot) {
		
      if(overallRoot == null) return 1;


      return countEmpty(overallRoot.left, 0) + countEmpty(overallRoot.right, 0);

	}
	
	private static int countEmpty(NodeClass overallRoot, int count) {

      if(overallRoot == null) return 1;

      if(overallRoot.left == null) count++;
      if(overallRoot.right == null) count++;

      return countEmpty(overallRoot.left, count) + countEmpty(overallRoot.right, count);
	}
