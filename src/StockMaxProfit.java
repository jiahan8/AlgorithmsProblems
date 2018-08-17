
public class StockMaxProfit {
	
	public int maxProfit( int [] prices ){
		
//		int highest = prices[0];
//		int lowest = prices[0];
		
		// highest must be at the right hand side of the lowest
		
//		int maxprofit = highest - lowest;
		int maxprofit = 0;
		
		// n x n
		for( int i = 0 ; i <= prices.length-2 ; i++){
			int left = prices[i];
			for(int j = i ; j <= prices.length -2 ; j++){
				int right = prices[j+1];
				int difference = right - left;
				System.out.println( left + " " + right );
				if( maxprofit <= difference ){
					maxprofit = difference ;
//					System.out.print("yes");
				}
			}	
		}
		
		
		// n
//		int min = Integer.MAX_VALUE;
//		for( int i = 0 ; i < prices.length ; i++){
//			if( min >= prices[i]){
////				maxprofit;
//				min = prices[i];
//			}
//			else if( maxprofit < prices[i] - min ){
////				maxprofit;
//				maxprofit = prices[i] - min;
//			}
//		}
		
		
		
		return maxprofit;
	}
	

}
