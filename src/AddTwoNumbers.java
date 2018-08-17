import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {
	
	public AddTwoNumbers( ){
			
		
	}
	
	// given 2 singly linked list, each represents a number,
	// then output the sum of the two numbers in singly linked list
	// eg 2->3->6 means 632
	// 2->3->6 and 1->8->1 will give 3->1->8
	// 632 + 181 = 813
	
	
	public List<Integer> addNumbers( List <Integer> l1 , List <Integer> l2 ){
		
		List<Integer> list = new ArrayList<>();
		
		int sum = 0;
		int currentsum = 0;
		boolean plusone = false;
		
		for( int i = 0 ; i < l1.size() ; i++){
			
			sum = l1.get(i) + l2.get(i);
			System.out.println( l1.get(i) + " " + l2.get(i) );
			if(sum >= 10){
				currentsum = sum - 10;
				addOne( plusone, currentsum , list);
				plusone = true;
			}else{
				currentsum = sum;
				addOne( plusone, currentsum , list);
				plusone = false;
			}
			
			
		}
		
		return list;
	}
	
	public boolean addOne( boolean bool , int x , List<Integer> v ){
		if(bool == true){
			int temp = x + 1;
			v.add( temp );
			if( temp >= 10 ){
				return true;
			}else{
				return false;
			}
		}else{
			v.add( x );
			return false;
		}
	}
	
	

}
