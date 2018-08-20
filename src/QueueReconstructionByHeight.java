import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
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
		
		
		
//		for( int row = 0; row < people.length ; row++ ){
////			for( int col = 0; col < 2 ; col++){
//				
//			int [] temp = people[row];
//			people[row] = people[];
//			
//			
//				people[1] = people[1];
//
////			}
//		}
		
		
		
		// arrange each elements
		
		
		
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

}
