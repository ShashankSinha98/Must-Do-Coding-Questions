
public class DetectLoopInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean detectLoop(Node head){
        // Add code here
		
		Node slow = head;
		Node fast = head;
		
		while(slow!=null && fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) return true;
		}
		
		
		return false;
    }
	
	class Node
	{
	    int data;
	    Node next;
	    Node(int d) {data = d; next = null; }
	}

}
