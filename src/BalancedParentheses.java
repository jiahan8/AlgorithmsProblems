import java.util.Stack;

public class BalancedParentheses {
	
	public boolean balancedParentheses( String sentense ){
		
		Stack <Character> s = new Stack <> ();
		
//		System.out.println(sentense.length());
		for( int i = 0 ; i < sentense.length() ; i++ ){
			
			char a = sentense.charAt(i);
			
			System.out.println(a + " " + s.size());
			
			if( a=='{' || a=='[' || a=='(' )
				s.push( sentense.charAt(i) );
			else if( a=='}' && !s.isEmpty() && s.peek()==('{') )
				s.pop();
			else if( a==']' && !s.isEmpty() && s.peek()==('[') )
				s.pop();
			else if( a==')' && !s.isEmpty() && s.peek()==('(') )
				s.pop();
			else
				return false;
			
		}
		
		if( s.isEmpty() )
			return true;
		else
			return false;
		
	}

}
