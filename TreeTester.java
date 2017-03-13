public class TreeTester {
	public static void main(String[] args) {
		TreeNode left = new TreeNode(2, null, null);
		TreeNode right = new TreeNode(5, null, null);
		TreeNode root = new TreeNode(3, left, right);
		BinaryTree tree = new BinaryTree(root);

		tree.insert(root, 1);
		tree.insert(root, 4);
		tree.insert(root, 7);
		tree.preOrder(root, 0);
		// System.out.println(tree.findMax(root).data);
		// System.out.println(tree.findMin(root).data);
		tree.remove(root, 5);
		tree.preOrder(root, 0);
		
	} 
}