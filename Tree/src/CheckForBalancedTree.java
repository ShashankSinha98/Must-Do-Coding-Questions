
public class CheckForBalancedTree {

	boolean isBalanced(Node root)
    {
		if(root==null) return false;
		
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		
		return (Math.abs(left-right)<=1) && isBalanced(root.left) && isBalanced(root.right);
    }
	
	private int getHeight(Node node) {
		
		if(node==null) return 0;
		
		int left = getHeight(node.left);
		int right = getHeight(node.right);
		
		return Math.max(left, right) + 1;
	}
}
