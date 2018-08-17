
public class ArrayProductExceptSelf {
	
	public int [] productExcept(int [] nums){
		
		// given array of size > 1, return an array with each index is product of other elements except itself
		
		int productall = 1;
		int zeronum = 0;
		
		for(int i=0; i< nums.length ; i++){
			if(nums[i] != 0 && zeronum <= 2){
				productall = productall * nums[i];
//				System.out.println(productall);
			}else if( zeronum >= 2){
				productall = 0;
			}else
				++zeronum;
		}
		
		
		for(int i=0; i< nums.length ; i++){
			
//			int product = 
//			num[i] = num[i];
			if( nums[i] == 0 && zeronum >= 2)
				nums[i] = 0;
			else if( nums[i] == 0)
				nums[i] = productall;
			else
				nums[i] = productall / nums[i];
		
		}
		
		
		System.out.println("productall: " + productall);
		for(int i = 0; i<nums.length;i++){
			System.out.println( nums[i] );
		}
		
		return nums;
		
	}

}
