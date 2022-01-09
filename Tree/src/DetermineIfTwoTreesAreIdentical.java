
public class DetermineIfTwoTreesAreIdentical {

	boolean isIdentical(Node root1, Node root2)
	{
	    if(root1==null && root2==null) return true;
	    
	    if(root1==null || root2==null) return false;
	    
	    boolean left = isIdentical(root1.left, root2.left);
	    boolean right = isIdentical(root1.right, root2.right);
	    
	    return left && right && root1.data == root2.data;
	}
	
}
