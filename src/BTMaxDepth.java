



public class BTMaxDepth {
	
	int depth = 0;
	
//	int left;
//	int right;
	
	public int maxDepth(TreeNode root){
		
		if( root == null ){
			return 0;
		}
		
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
//		
		System.out.println(root.val);
		System.out.println(left + " " + right);
//		
//		if(left > right){
////			System.out.println("left " + left);
//			return ++left;
//		}else{
////			System.out.println("right " + right);
//			return ++right;
//		}
		
		
//		return Math.max( maxDepth( root.left ) , maxDepth( root.right ) ) + 1;
		return Math.max( left, right ) + 1;
		
		
//		return 0;
	
	
	}

}
