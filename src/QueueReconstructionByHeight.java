import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;



public class QueueReconstructionByHeight {
	
	public int[][] reconstructQueue(int [][] people){
		
		
//		Queue <Integer> q = new PriorityQueue<>();
//		q.add(2);
		
		// h = height of the person, k = number of people in front who is taller or equals height
		// first person in the array is in front of the second person
		
		
		int [][] result = new int [people.length][2]  ;
		HashMap <Integer, Integer> map = new HashMap<>();
		
		LinkedList <Value> list = new LinkedList<>();
		
//		for( int row = 0; row < people.length ; row++ ){
////			for( int col = 0; col < 2 ; col++){
//				
////				int x = people[row][col];
//				
//				System.out.println(people[row][0] + " " + people[row][1]);
//				map.put(people[row][0], people[row][1]);
//				
////			}
//		}
		
//		result[2][0] = 2;
		
		
		// sorting descending
		Arrays.sort( people, new Comparator <int[]>(){

			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o2[0], o1[0]);
//				return ;
			}
			
		});
		
		
		// arrange each elements
		for( int row = 0; row < people.length ; row++ ){
//			for( int col = 0; col < 2 ; col++){
				
				int height = people[row][0]; // get first value
				int infrontpplnum = people[row][1]; // get second value
				
				
				System.out.println(height + " " + infrontpplnum);
//				people[1] = people[1];
			
//				if( 1 == 1 ){
//					swaparray2d( people[row], people[row] );
//				}
				
				Value value = new Value( height, infrontpplnum );
				
				if(list.isEmpty())
					list.add(value);
				else{
					
					int infront = 0;
					
					// loop the result list
					for(Value x: list){
						
						if(x.height >= height){
							++infront;
						}
						
					}
					
					list.add(value);
					
					
				}
				

//			}
		}
		
				
		
		
//		for(Map.Entry<Integer, Integer> m : map.entrySet()){
//			
//			System.out.println(m.getKey() + " " + m.getValue());
//			
//		}
		
		
		// show result
		for( int row = 0; row < people.length ; row++ ){
			for( int col = 0; col < 2 ; col++){
				System.out.print( people[row][col] );
			}
			System.out.println();
		}
		
		
		return people;
		
	}
	
	
	public void swaparray2d( int [] a, int [] b){
		int [] temp = a;
		a = b;
		b = temp;
	}
	
	
	
	public class Value{
		Value prev;
		Value next;
		
		int height;
		int infront;
		
		Value(int x, int y){
			height = x;
			infront = y;
		}
		
	}
	

}
