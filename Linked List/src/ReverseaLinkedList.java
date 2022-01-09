
public class ReverseaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node {
	    int value;
	    Node next;
	    Node(int value) {
	        this.value = value;
	    }
	}
	
	Node reverseList(Node head)
    {
        if(head.next==null) return head;
        
        Node a = head;
        Node b = null;
        
        while(a!=null) {
        	Node temp = a.next;
        	a.next = b;
        	b = a;
        	a = temp;
        }
        
        return b;
    }

}
