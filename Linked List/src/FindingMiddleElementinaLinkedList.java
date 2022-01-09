
public class FindingMiddleElementinaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node {
		   int data;
		    Node next;
		    Node(int d)  { data = d;  next = null; }
	}
	
	int getMiddle(Node head)
    {
         Node fast = head;
         Node slow = head;
         
         while(fast.next!=null && fast.next.next!=null) {
             fast = fast.next.next;
             slow = slow.next;
         }
         
         if(fast.next!=null) slow = slow.next;
         
         return slow.data;
    }

}
