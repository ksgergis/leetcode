	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		return mergeTreesRec(t1, t2);
	}

	public TreeNode mergeTreesRec(TreeNode t1, TreeNode t2) {
		if (t2 == null) {
			return t1;
		}
		if (t1 == null) {
			return t2;
		}
		TreeNode newNode = new TreeNode(t1.val + t2.val);
		newNode.right = mergeTreesRec(t1.right, t2.right);
		newNode.left = mergeTreesRec(t1.left, t2.left);
		return newNode;
	}