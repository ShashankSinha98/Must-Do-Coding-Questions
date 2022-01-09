
public class ReverseALinkedListInGroupsOfGivenSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node
	{
	    int data;
	    Node next;
	    Node(int key)
	    {
	        data = key;
	        next = null;
	    }
	}
	
	public static Node reverse(Node head, int k)
    {
        Node prev=null, next=null;
        Node curr = head;
        int pos=0;
        
        while(pos<k && curr!=null) {
        	next = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = next;
        	pos++;
        }
        
        if(curr!=null) {
        	head.next = reverse(curr, k);
        }
        
        
        return prev;
    }

}
