import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;

public class BTMaxLevel {
	
	public int rob(TreeNode root){
		
		
		int val = root.val;
		
		// given a binary tree, return the maximum of sum of every other level
		
		
		// level order traversal
		Queue <TreeNode> queue = new LinkedList<>();
		queue.add( root );
		
		while(!queue.isEmpty()){
			
			TreeNode current = queue.peek();
			
			if( current.left != null){
				queue.add( current.left );
			}
			if( current.right != null){
				queue.add( current.right );				
			}
			
			queue.poll();
			
		}
		
		
		
		return 0;
		
	}

}
