public static List inOrder(NodeClass root, List<Integer> list) {
		if(root == null) {
			return list;
		} else{
			
			inOrder(root.left, list);
			list.add(root.val2);
			inOrder(root.right, list);
			
		return list;
		}
		
	
	}
