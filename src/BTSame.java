
public class BTSame {
	
	int result = 0;
	
	public boolean isSameTree(TreeNode p, TreeNode q){
		
		
		// check if two binary tree has the same structure and values
		
//		if( p == null ^ q == null ){
//			return false;
//		}
		
		
//		System.out.println(p.val + "==" + q.val);
		if( p != null && q != null ){
			
			isSameTree(p.right, q.right);
		
			isSameTree(p.left, q.left);
		
			
			System.out.println(p.val + "==" + q.val);
			if( (p.val) != (q.val) ){
//				System.out.println(p.val + "!=" + q.val);
				++result;
//				return false;
			}else{
//				return true;
			}
			
			
			if( result != 0 )
				return false;
			else
				return true;
			
		
		}
		else if ( p == null ^ q == null ) {
//		
//			System.out.println("null");
			++result;
			return false;
//			
		}
		else{
			
			return true;
			
		}
		
	}

}
