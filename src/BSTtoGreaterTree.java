





public class BSTtoGreaterTree {

//	TreeNode a = new TreeNode( 0 );
	
	private int sum = 0;
	
	public TreeNode convertBST(TreeNode root){
		
		
		// for every node, sum up all other nodes that are greater than itself with itself
		// result will be a invert bst
		
		// use reverse in order traversal ( right, middle, left)
		
//		TreeNode result = root;
		
		if( root == null){
			return null;
		}
		
//		int l = root.val;
		TreeNode right = convertBST(root.right);
		
//		root.val = root.val + right.val;
		sum = sum + root.val;
		root.val = sum;
//		System.out.println(root.val);

		TreeNode left = convertBST(root.left);
		
//		root.val = root.val + left.val;
		
//		if(right == null)
//			right.val = 0;
//		if(left == null)
//			left.val = 0;
		
//		root.val = root.val + right.val + left.val;
//		root.val = root.val + right.val;
		
//		sum = sum + root.val;
//		root.val = sum;
		
		
//		System.out.println(root.val);
		
		
		return root;
		
		
		
//		if(root!=null){
//			convertBST(root.right);
//			sum = sum + root.val;
//			root.val = sum;
//			convertBST(root.left);
//		}
//		return root;
		
		
	}
	

	
	
}
