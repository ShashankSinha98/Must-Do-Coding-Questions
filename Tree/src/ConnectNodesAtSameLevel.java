import java.util.*;

public class ConnectNodesAtSameLevel {
	
	
	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(1);
		root.right = new Node(2);
		
		connect(root);
	}
	

	static class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
        
        @Override
        public String toString() {
        	// TODO Auto-generated method stub
        	return ""+data;
        }
    }
	
	public static void connect(Node root)
    {
        Queue<Node> queue = new LinkedList<>();
        
        if(root==null) return;
        
        queue.add(root);
        
        while(!queue.isEmpty()) {
        	
        	Node curr = queue.poll();
        	int size = queue.size();
        	
        	if(curr.left!=null) queue.add(curr.left);
        	if(curr.right!=null) queue.add(curr.right);
        	
        	while(size!=0) {
        		Node temp = queue.poll();
        		
        		if(temp.left!=null) queue.add(temp.left);
            	if(temp.right!=null) queue.add(temp.right);
            	
        		curr.nextRight = temp;
        		curr = temp;
        		size--;
        	}
        	
        	curr.nextRight = null;
        }
    }
}
