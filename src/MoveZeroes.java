



public class MoveZeroes {
	
	public void moveZeroes( int [] nums ){
		
		// put zeroes to the end of array, remain the same order for non zeroes elements
		// in-place, minimize the total number of operations
		
//		int firstnonzeroes = 0;
		
		for(int i=0; i< nums.length ; i++){
			
			if(nums[i] == 0){
				
				for(int j = i ; j < nums.length ; j++){
					if(nums[j] != 0){
						
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
						
						System.out.println( "swap " + nums[i] + " with " + temp );

						break;
					}
				}
				
				
							
			}
		}
		
		
		for(int i = 0; i<nums.length ; i++){
			System.out.println(nums[i]);
		}
		
	}

}
