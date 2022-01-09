import java.util.*;

public class LevelOrderTraversalInSpiralForm {
	
	ArrayList<Integer> findSpiral(Node root) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(root==null) return res;
        
        
        Stack<Node> st1 = new Stack<>(); // LR
        Stack<Node> st2 = new Stack<>(); // RL
    
        st1.add(root);
        
        while(!st1.isEmpty() && !st2.isEmpty()) {
        	
        	while(!st1.isEmpty()) {
        		Node n = st1.pop();
        		res.add(n.data);
        		
        		if(n.right!=null) st2.add(n.right);
        		if(n.left!=null) st2.add(n.left);
        	}
        	
        	while(!st2.isEmpty()) {
        		Node n = st2.pop();
        		res.add(n.data);
        		
        		if(n.left!=null) st1.add(n.left);
        		if(n.right!=null) st1.add(n.right);
        	}
        }
        
        return res;
    }
	
}
