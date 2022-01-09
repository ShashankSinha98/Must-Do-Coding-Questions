
public class FlatteningaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Node
	{
		int data;
		Node next;
		Node bottom;
		
		Node(int d)
		{
			data = d;
			next = null;
			bottom = null;
		}
	}
	
	Node flatten(Node root)
    {
		// base case
		if(root==null || root.next==null) return root;
		
		
		// recursive case
		return merge(root,flatten(root.next));
    }
	
	Node merge(Node a, Node b) {
		
		// base case
		if(a==null) return b;
		if(b==null) return a;
		
		// recursive case
		Node result;
		
		if(a.data<b.data) {
			result = a;
			result.bottom = merge(a.bottom, b);
		} else {
			result = b;
			result.bottom = merge(a, b.bottom);
		}
		
		result.next = null;
		
		return result;
		
	}

}
