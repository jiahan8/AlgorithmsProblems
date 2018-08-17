//import javax.swing.tree.TreeNode;

public class BTInvert {
	
//	public class TreeNode {
//		int val;
//		TreeNode left;
//		TreeNode right;
//		TreeNode(int x){
//			val = x;
//		}
//	}	

	public TreeNode invertTree (TreeNode root){
		
//		int root.val;

//		System.out.println(root.val);

		if(root == null){
			return null;
		}
		
//		swap( root.left , root.right );
		
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		
//		System.out.println(left);
		
		root.left = right;
		root.right = left;
		System.out.println("swap " + root.left + " with " + root.right );
		
		
		System.out.println(root.val);
		return root;
		
	}
	
	public void swap( TreeNode left, TreeNode right){
		TreeNode temp = new TreeNode(0);
		
		temp = right;
		right = left;
		left = temp;
		
	}
	
}
