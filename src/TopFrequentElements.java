import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class TopFrequentElements {
	
	public List<Integer> frequentElements(int [] nums, int k){
		
		
		List<Integer> result = new ArrayList<>();
		
		// return top k frequent elements
		
		
		TreeMap <Integer, Integer> tree = new TreeMap<>();
		int [] frequencytop = new int [k];
		
		PriorityQueue <Integer> queue = new PriorityQueue<>();
//		HashSet<Integer> set = new HashSet<>();
		TreeSet<Integer> set = new TreeSet<>();
		
		
		// putting elements
		for(int i=0;i<nums.length;i++){
			
//			int frequency = 1;
			
			if(tree.containsKey(nums[i])){
				int frequency = tree.get(nums[i]) + 1;
				tree.put(nums[i], frequency );
				
				set.add(frequency);
				
			}
			else{
				tree.put(nums[i], 1 );
				
				set.add(1);
				
			}
			
		}
		
		
		for(int i=0; i<k;i++)
			frequencytop[i] = set.pollLast();
//		queue.poll();
		
		
		
		// searching elements
//		for(int i = 0; i<k ;i++){
		for(Map.Entry<Integer, Integer> map : tree.entrySet() ){	
			
			for(int i=0;i<k;i++){
				if(map.getValue() == frequencytop[i]){
					result.add(map.getKey());
				}
			}
			
		}
		
		
		return result;
		
		
	}

}
