
public class HeightofBinaryTree {
	
	int maxHeight;
	int height(Node node) 
    {
		if(node==null) return 0;
		
		maxHeight = 0;
		getHeight(node, 0);
		return maxHeight+1;
    }
	
	void getHeight(Node root, int currHeight) {
		if(root==null) return;
		
		if(currHeight > maxHeight) maxHeight = currHeight;
		
		getHeight(root.left, currHeight+1);
		getHeight(root.right, currHeight+1);
	}
}
