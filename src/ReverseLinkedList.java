


public class ReverseLinkedList {
	
	public ListNode reverseList(ListNode head){
		
		ListNode ln = new ListNode(2);
		
		ListNode current = head;
		ListNode prev = null;
		
		// reverse a singly linked list
		
		
//		while( head.next != null ){
		while( current != null ){
//			if(head.prev == null)
//			head.next = null;
			
//			head = head.prev;
//			head.next = head;
//			head = 
			
			ListNode temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
			
		}
		
//		reverseList(head);
		
		
//		return head;
		return prev;
		
	}

}
