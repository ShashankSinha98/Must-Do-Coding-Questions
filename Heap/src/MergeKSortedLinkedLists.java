import java.util.*;
public class MergeKSortedLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	Node mergeKList(Node[]arr,int K) {
        PriorityQueue<Node> pq = new PriorityQueue<>(new CustomComparator());
        Node res = new Node(-1);
        Node temp = res;
        
        for(Node n: arr) {
        	pq.add(n);
        }
        
        while(!pq.isEmpty() ) {
        	Node t = pq.poll();
        	if(t.next!=null) pq.add(t.next);
        	temp.next = t;
        	temp = t;
        }
        
        return res.next;
    }
	
	class CustomComparator implements Comparator<Node> {

		@Override
		public int compare(Node n1, Node n2) {
			return n1.data<n2.data?-1:1;
		}
		
	}
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
