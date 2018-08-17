import java.util.ArrayList;
import java.util.List;



public class BTInorderTraversal {
	
	public List<Integer> inorderTraversal( TreeNode root ){
		
		// in order traversal, left middle right
		// recursive and iterative answer
		
		List <Integer> l = new ArrayList<>();
		
		if(root != null){
		
		inorderTraversal(root.left);
		l.add( root.val );
		inorderTraversal(root.right);
		
		}
		
		return l;
		
		
	}

}
