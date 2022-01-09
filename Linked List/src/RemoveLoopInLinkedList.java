
public class RemoveLoopInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node
	{
	    int data;
	    Node next;
	}
	
	
    public static void removeLoop(Node head) {
     
    	// find loop
    	Node fast = head;
    	Node slow = head;
    	
    	while(fast!=null && fast.next!=null) {
    		fast = fast.next.next;
    		slow = slow.next;
    		
    		if(fast==slow) break;
    	}
    	
    	if(fast!=null && fast.next!=null) { // Loop exists
    		
    		if(fast!=head) { // Place fast to head and move it by 1
    			fast = head;
    			
    			while(fast.next!=slow.next) {
    				fast = fast.next;
    				slow = slow.next;
    			}
    			
    			slow.next = null;
    			
    		} else {
    			// Look for one node prev to head and point it to null
    			while(slow.next!=head) {slow = slow.next;}
    			
    			slow.next = null;
    		}
    	}
    }

}
