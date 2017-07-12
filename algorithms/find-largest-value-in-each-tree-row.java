import java.util.LinkedList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Solution {
	public static void main(String[] args) {
		System.out.println(largestValues(null));
	}

	
	public static List<Integer> largestValues(TreeNode root) {
		if(root == null){
			return new LinkedList<>();
		}
		List<Integer> result = new LinkedList<Integer>();
		List<TreeNode> treeRow = new LinkedList<TreeNode>();
		treeRow.add(root);
		while (!treeRow.isEmpty()) {
			int rowMax = Integer.MIN_VALUE;
			List<TreeNode> nextRow = new LinkedList<TreeNode>();
			for (TreeNode node : treeRow) {
				if (node.val > rowMax) {
					rowMax = node.val;
				}
				if (node.left != null) {
					nextRow.add(node.left);
				}
				if (node.right != null) {
					nextRow.add(node.right);
				}
			}
			treeRow = nextRow;
			result.add(rowMax);
		}
		return result;
	}
}