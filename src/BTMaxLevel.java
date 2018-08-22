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
		
		int levela = 0;
		int levelb = 0;
		
		int height = 0;
		
		while(!queue.isEmpty()){
			
			TreeNode current = queue.peek();
			
			height = queue.size();
			
			while(height > 0){
				
				System.out.print(current.val + " " );
			
				if( current.left != null){
					queue.add( current.left );
				}
				if( current.right != null){
					queue.add( current.right );				
				}
				
				height--;
			}
			
			System.out.println();
			
			queue.poll();
			
		}
		
		
		if(levela > levelb)
			return levela;
		else
			return levelb;
		
		
//		return 0;
		
	}

}
