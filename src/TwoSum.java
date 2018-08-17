
public class TwoSum {

	public int[] twoSum(int [] nums, int target){
		
		// given target, find the indexes of the 2 numbers that can be add up to equals the target
		
		int result[] = new int [2];
		int maxprofit = 0;

		for( int i = 0 ; i <= nums.length-2 ; i++){
			int left = nums[i];
			for(int j = i ; j <= nums.length -2 ; j++){
				int right = nums[j+1];
				
				int sum = right + left;
				
				if( sum == target ){
					result[0] = i;
					result[1] = j+1;
				}
				
			}	
		}
//		System.out.println( result[0] + " " + result[1] );
		return result;
		
	}
	
}
