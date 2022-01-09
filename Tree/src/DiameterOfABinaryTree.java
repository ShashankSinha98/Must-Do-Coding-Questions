
public class DiameterOfABinaryTree {

	int maxDiameter;
	
	int diameter(Node root) {
        
		maxDiameter = 0;
		
		getMaxHeight(root);
		
		return maxDiameter;
    }
	
	private int getMaxHeight(Node node) {
		
		if(node==null) return 0;
		
		int left = getMaxHeight(node.left);
		int right = getMaxHeight(node.right);
		
		if(left+right+1>maxDiameter) maxDiameter =  left+right+1;
		
		return Math.max(left, right) + 1;
	}
}
