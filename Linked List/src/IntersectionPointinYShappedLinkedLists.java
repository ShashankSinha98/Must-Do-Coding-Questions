
public class IntersectionPointinYShappedLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	class Node {
		   int data;
		    Node next;
		    Node(int d)  { data = d;  next = null; }
		}
	
	int intersectPoint(Node head1, Node head2)
	{
		int l1 = length(head1);
		int l2 = length(head2);
		
		int diff = Math.abs(l1-l2);
		
		Node s1 = (l1>l2)? move(head1, diff) : move(head2, diff);
		Node s2 = (l1>l2)? head2: head1;
		
		while(s1!=null && s2!=null) {
			if(s1==s2) return s1.data;
			s1 = s1.next;
			s2 = s2.next;
		}
		return -1;
	}
	
	Node move(Node head, int pos) {
		if(pos==0) return head;
		
		int c=0;
		Node curr = head;
		while(c<pos) {
			c++;
			curr = curr.next;
		}
		
		return curr;
	}
	
	int length(Node head) {
		int s=0;
		while(head!=null) {
			s++;
			head = head.next;
		}
		return s;
	}

}
