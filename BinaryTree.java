public class BinaryTree {

	public TreeNode root;

	public BinaryTree(TreeNode root) {
		this.root = root;
	}

	public boolean contains(TreeNode root, int element) {

		if(root == null) {
			return false;
		}

		if(root.data > element) {
			return contains(root.left, element);
		} else if(root.data < element) {
			return contains(root.right, element);
		} else { 
			return true; 
		}
	}

	public TreeNode findMax(TreeNode root) {
		while(root.right != null) {
			root = root.right;
		}
		return root;
	}

	public TreeNode findMin(TreeNode root) {
		if(root == null) {
			return null;
		} else if(root.left == null) {
			return root;
		}

		return findMin(root.left);
	}


	public TreeNode insert(TreeNode root, int element) {
		if(root == null) {
			return new TreeNode(element, null, null);
		}

		if(element < root.data) {
			root.left = insert(root.left, element);
		} else if(element > root.data) {
			root.right = insert(root.right, element);
		}

		return root;
	}

	public void postOrder(TreeNode root) {
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}
	}

	public void preOrder(TreeNode root, int tabs) {
		if(root != null) {
			for(int i = 0; i < tabs; i ++) {
				System.out.print("   ");
			}
			System.out.println(root.data);
			preOrder(root.left, tabs + 1);
			preOrder(root.right, tabs + 1);
		}
	}

	public void inOrder(TreeNode root) {
		if(root != null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}

	public TreeNode remove(TreeNode root, int x) {
		if(root == null) {
			return root;
		}

		if(x < root.data) {
			root.left = remove(root.left, x);
		} else if(x > root.data) {
			root.right = remove(root.right, x);
		} else if(root.left != null && root.right != null) {
			root.data = findMin(root.right).data;
			root.right = remove(root.right, root.data);
		} else {
			root = (root.left != null) ? root.left : root.right;
		}

		return root;

	}

	public TreeNode findNode(int data, TreeNode root) {
		if(root != null) {
			if(root.data == data) {
				return root;
			} else {
			TreeNode node = findNode(data, root.left);
			if(node == null) {
				node = findNode(data, root.right);
			} 
			return node;
			} 
		} else {
			return null;
		}
    }


}