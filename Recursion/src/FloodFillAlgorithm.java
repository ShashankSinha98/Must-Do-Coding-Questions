import java.util.Arrays;

public class FloodFillAlgorithm {

	public static void main(String[] args) {
		
		int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
		
		int[][] res = floodFill(image, 1, 1, 2);
		
		print2DArray(res);

	}
	
	
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
		if(newColor==image[sr][sc]) return image;
        return recc(image, sr, sc, newColor, image[sr][sc]);
    }
	
	private static int[][] recc(int[][] image, int sr, int sc, int newColor, int oldColor) {
		if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length)
        	return image;
        
        if(image[sr][sc]!=oldColor) return image;
        
        image[sr][sc]=newColor;
        
        recc(image, sr+1, sc, newColor, oldColor);
        recc(image, sr-1, sc, newColor, oldColor);
        recc(image, sr, sc-1, newColor, oldColor);
        recc(image, sr, sc+1, newColor, oldColor);
        
        return image;
	}
	
	static void print2DArray(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+", ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
