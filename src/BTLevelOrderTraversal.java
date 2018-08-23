import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTLevelOrderTraversal {
	
	public List<List<Integer>> levelorder (TreeNode root){
		
		
		List<List<Integer>> result = new ArrayList<>();
		
		// return elements in level order
		
		List<Integer> level = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		
		
		if(root != null){
			queue.add(root);
		}
		
		
		while( !queue.isEmpty() ){
			
			TreeNode current = root;
			
			queue.add(current);
			
			if(current.left != null){
				queue.add(current.left);
			}
			if(current.right != null){
				queue.add(current.right);
			}
			
			queue.poll();
			
		}
		
		
		
		return result;
		
		
	}

}
