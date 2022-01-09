
public class ConstructTreeFromInorderAndPreorder {

	public static Node buildTree(int inorder[], int preorder[], int n)
    {
         return buildTreeHelper(0, n, 0, inorder, preorder, n);
    }
	
	private static Node buildTreeHelper(int st, int end, int preOrderCurrIdx, int[] inorder, int[] preorder, int n) {
		  
		if(st > end || preOrderCurrIdx >=n) return null;
		
		
		Node root = new Node(preorder[preOrderCurrIdx++]);
		
		
		int idx = search(root.data, st, end, inorder);
		
		root.left = buildTreeHelper(st, idx-1, preOrderCurrIdx, inorder, preorder, n);
		root.right = buildTreeHelper(idx+1, end, preOrderCurrIdx, inorder, preorder, n);
		
		return root;		
	}
	
	private static int search(int num, int st, int end, int[] inorder) {
		
		for(int i=st; i<=end; i++) {
			if(inorder[i]==num) return i;
		}
		return -1;
	}
	
	
}
