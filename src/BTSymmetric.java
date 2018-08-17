import java.util.ArrayList;
import java.util.List;

public class BTSymmetric {
	
	public boolean isSymmetric(TreeNode root){
		
		
		// check if the tree is symmetric (mirror of itself)
		
		
//		if(root == null){
//			return false;
//		}
		
		
//		isSymmetric(root.right);
		
//		isSymmetric(root.left);
		
		
		boolean a = checkMirror( root, root );
		
		
		return a;
//		return true;
	}
	
	
	public boolean checkMirror( TreeNode node1, TreeNode node2 ){
		
		List <Boolean> what = new ArrayList<>();
		
		if(node1 == null && node2 == null){
			System.out.println("null");
			return true;
		}
		
		if(node1 != null && node2 != null && node1.val == node2.val ){
			System.out.println(node1.val + " " + node2.val);
			return checkMirror( node1.left , node2.right) && checkMirror( node1.right , node2.left );
		}
		
		System.out.println("return false");
		return false;
		
		
	}
	
	
	

}
