import java.util.ArrayList;
import java.util.List;



public class GenerateParentheses {

	public List<String> generateParenthesis( int n ){
		
		List<String> l = new ArrayList<>();
		
		// generate parentheses
		
		String x = "";
		for(int i = 1 ; i <= n * 2 ; i ++)
			x += ")";
		System.out.println(x.length());
		
		for( int i = 0; i < n ; i++){
			
			
			char a = '(';
			char b = ')';
			
			StringBuilder eachstring = new StringBuilder(x);
//			String eachstring = x ;
			
			eachstring.setCharAt(i, a);
			eachstring.setCharAt(i+1, a);
			
			
			l.add(eachstring.toString());

		}
		
		
		return l;
		
		
	}
	
}
