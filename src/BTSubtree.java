
public class BTSubtree {
	
	public boolean subtree( TreeNode p, TreeNode q ){
		
		
		//  check if the binary tree (q) is a subtree of a binary tree (p)
		
		
		if(p == null && q == null){
			return true;
		}
		
		
		if(p != null && q != null && p.val == q.val){
			return ( subtree(p.right , q.right) && subtree(p.left , q.left));
		}
		
//		subtree(p.right, q.right);
		
		
//		subtree(p.left, q.left);
		
	
		
		return false;
	
	
	}

}
