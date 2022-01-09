import java.util.*;

public class PrintLeftViewofBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	ArrayList<Integer> leftViewLevelOrder(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
        	
        	int lim = queue.size();
        	for(int i=0; i<lim; i++) {
        		Node temp = queue.poll();
        		
        		if(i==0) list.add(temp.data);
        		
        		if(temp.left!=null) queue.add(temp.left);
        		if(temp.right!=null) queue.add(temp.right);
        	}
        	
        }
        
        return list;     
    }
	
	
	static int maxHeight;
	public ArrayList<Integer> leftViewRecc(Node root) {
		
		ArrayList<Integer> list = new ArrayList<>();
		maxHeight = -1;
		
		
		getLeftViewRecc(root, 0, list); 
		
		return list;
	}
	
	private void getLeftViewRecc(Node root, int currHeight, ArrayList<Integer> list) {
		
		if(root==null) return;
		
		if(currHeight>maxHeight) {
			list.add(root.data);
			maxHeight = currHeight;
		}
		
		getLeftViewRecc(root.left, currHeight+1, list);
		getLeftViewRecc(root.right, currHeight+1, list);
		
		
	}

}
