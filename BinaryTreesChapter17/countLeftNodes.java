public static int countLeftNodes(NodeClass overallRoot) {
		
      if(overallRoot == null) return 0;

      return countLeftNodes(overallRoot, 0);
		
	}
	
	private static int countLeftNodes(NodeClass overallRoot, int count) {
		
        if(overallRoot == null) return count;

        if(overallRoot.left != null) {
          count++;
        }

        return countLeftNodes(overallRoot.left, count) + countLeftNodes(overallRoot.right);
      }

}
