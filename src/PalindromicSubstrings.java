import java.util.HashMap;

public class PalindromicSubstrings {
	
	public int countSubstrings( String s ){
		
//		HashMap <String, String> hm = new HashMap <> ();
//		hm.put( s , s );
//		int totalsubstrings = hm.size();
		
		int totalsubstrings = 0;
		
		for(int i = 0; i < s.length() ; i++){
			for(int j = i+1; j < s.length()+1 ; j++){
				
				String substring = s.substring(i, j);
//				System.out.println(substring);
				
				String reversedstring = reverse( substring );
				if( reversedstring.equals( substring ) ){
					System.out.println( "-" + reversedstring);
					++totalsubstrings;
				}
			
			}
		}
		
		return totalsubstrings;
		
		
	}
	
	public String reverse( String a ){
		
//		String result = "";
		if(a.length()==1){
			return a;
		}

//		for(int i = 0 ; i < a.length()/2 ; i++){
//			
////			char temp = a.charAt(i);
////			System.out.println(a.charAt(i));
////			System.out.println(a.charAt(a.length() -i -1));
//			a.replace( a.charAt(i), a.charAt( a.length() -i -1) );
//			a.replace( a.charAt(a.length() -i -1), a.charAt(i) );
//			
//			
////			result.concat( String.valueOf(a.charAt(i)) );
//			
//		}
		
		
		String finalsubstring = "";
		
		for(int i = a.length()-1 ; i >= 0 ; i--){
//			System.out.println(a.charAt(i));
			finalsubstring += a.charAt(i);
		}
		
		
//		for()
//		System.out.println(finalsubstring);
		
		
		return finalsubstring;
		
	}
	

}
