
public class HammingDistance {
	
	
	public int hammingDistance(int x, int y){
		
		int result = x ^ y;
		
		String binary = Integer.toBinaryString( result );
		int count = 0;
		
		for( int i = 0 ; i < binary.length() ; i++){
			if(binary.charAt(i) == '1'){
				++count;
			}
		}
			
//		System.out.println( count );
		
		
		
		return count;
	
	}

}
