
public class RotateALinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node h = new Node(1);
		h.next = new Node(2);
		h.next.next = new Node(3);
		h.next.next.next = new Node(4);
	}
	
	public Node rotate(Node head, int k) {
        // add code here
		int len = length(head);
		
		if(k==0 || k==len) return head;
		
		
		Node tail = getNode(head, len);
		Node prev = getNode(head, k);
		
		tail.next = head;
		Node newHead = prev.next;
		prev.next = null;
		
		return newHead;
		
    }
	
	public Node getNode(Node head, int pos) {
		int s=1;
		Node temp = head;
		
		while(temp!=null && s<pos) {
			s++;
			temp = temp.next;
		}
		
		return temp;
	}
	
	public int length(Node head) {
		int s = 0;
		while(head!=null) {
			s++;
			head = head.next;
		}
		return s;
	}

}
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

