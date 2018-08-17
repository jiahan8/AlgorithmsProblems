import java.util.LinkedList;

public class LinkedListCycle {
	
	public boolean hasCycle( ListNode head ){
		
//		LinkedList<ListNode> ll = new LinkedList();
//		head.next;
		
		if(head == null)
			return false;
		
		ListNode fast = head.next;
		ListNode slow = head;
		
		while( fast != null && fast.next != null && slow != null){
			
			if( fast == slow )
				return true;
			
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return false;
		
	}
	
	class ListNode{
		int val;
		ListNode next;
		ListNode( int x ){
			val = x;
			next = null;
		}
	}

}
