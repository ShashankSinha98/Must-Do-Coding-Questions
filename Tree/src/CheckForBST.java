
public class CheckForBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	
	boolean isBST(Node root)
    {
        return checkBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
	
	private boolean checkBST(Node root, int minAllowed, int maxAllowed) {
		
		if(root==null) return true;
		
		if(root.data <= minAllowed) return false;
		
		if(root.data >= maxAllowed) return false;
		
		boolean isLeftBST = checkBST(root.left, minAllowed, root.data);
		boolean isRightBST = checkBST(root.right, root.data, maxAllowed);
		
		return isLeftBST && isRightBST;
	}

}
