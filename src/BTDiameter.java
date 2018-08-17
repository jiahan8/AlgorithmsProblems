
public class BTDiameter {
	
	
	public int diameterOfBinaryTree(TreeNode root){
		
		
		// diameter between two farthest nodes (may past through root node)
		
		
		if(root == null){
			return 0;
		}
		
//		if(root != null){
		
		int left = diameterOfBinaryTree(root.left);
		
		int right = diameterOfBinaryTree(root.right);
		
		
		
		System.out.println( root.val + " " + left + " " + right);
//		System.out.println(root.val);
		
		
		return ( left + right ) + 1;
		
//		finaldiameter(1);
		
		
//		}
		
//		return 0;
		
	}
	
	
	public int finaldiameter(int x){
		int result = x - 1;
		return result;
	}
	
	

}
