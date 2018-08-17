import java.util.PriorityQueue;
import java.util.Queue;



public class QueueReconstructionByHeight {
	
	public int[][] reconstructQueue(int [][] people){
		
		
//		Queue <Integer> q = new PriorityQueue<>();
//		q.add(2);
		
		// h = height of the person, k = number of people in front who is taller or equals height
		// first person in the array is in front of the second person
		
		
		int [][] result = new int [people.length][2]  ;
		
		for( int row = 0; row < people.length ; row++ ){
			for( int col = 0; col < 2 ; col++){
				int x = people[row][col];
			}
		}
		
		result[2][0] = 2;
		
		
		
		
		// show result
		for( int row = 0; row < people.length ; row++ ){
			for( int col = 0; col < 2 ; col++){
				System.out.print( result[row][col] );
			}
			System.out.println();
		}
		
		
		return result;
		
	}

}
