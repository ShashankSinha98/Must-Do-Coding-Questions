
public class SymmetricTree {

	public static boolean isSymmetric(Node root)
    {
        return areMirror(root, root);
    }
	
	private static boolean areMirror(Node n1, Node n2) {
		
		if(n1==null && n2==null) return true;
		
		if(n1==null || n2==null) return false;
		
		return areMirror(n1.left, n2.right) && 
			   areMirror(n1.right, n2.left) &&
			   n1.data == n2.data;
	}
	
}
