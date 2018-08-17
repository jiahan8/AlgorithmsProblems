import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class NumbersDisappearedInArray {
	
	public List <Integer> findDisappearedNumbers( int [] num ){
		
		List <Integer> result = new ArrayList<>();
		
		// given an array with values of 1 to size of array
		// find disappeared values between 1 and size of array inclusive
		
		if(num.length == 0)
			return result;
		
		int max = num.length;
		
//		HashMap <Integer, Integer> map = new HashMap<>();
		TreeSet <Integer> map = new TreeSet<>();
		for(int i = 0 ; i < num.length ; i++){
			map.add(num[i]);
		}
		
		
		
		for(int val = 1;  val<= max ; val++){
			if( !map.contains(val) )
				result.add(val);
		}
				
		
		return result;
		
	}
	

}
