import java.util.ArrayList;
import java.util.List;

public class Subsets {
	
	
	public List<List<Integer>> subsets(int [] nums){
		
		
		// given a distinct integers array, return all possible subsets
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		List<Integer> subset = new ArrayList<>();
		
		int size = nums.length;
		
		
		for(int i = 0; i< size ; i++ ){
			
			
			for(int j=i; j<size; j++ ){
				
				subset.add(nums[j]);
				
				
			}
			
			
			result.add(subset);
			
		}
		
		
		
		
		return null;
		
	}
	

}
