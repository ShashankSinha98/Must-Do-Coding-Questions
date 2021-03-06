import java.util.*;
public class FindTheNumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private static boolean visited[][];
	public int numIslands(char[][] grid) {
		int l = grid.length;
		int w = grid[0].length;
		visited = new boolean[l][w];
		
		int count=0;
		
		for(int i=0; i<l; i++) {
			for(int j=0; j<w; j++) {
				
				if(grid[i][j]=='1' && !visited[i][j]) {
					count++;
					dfs(i, j, grid, l, w);
				}
			}
		}
		
		return count;
    }
	
	private void dfs(int i, int j, char[][] grid, int l, int w) {
		
		if(i<0 || i>=l || j<0 || j>= w || grid[i][j]=='0' || visited[i][j]) return;
		
		visited[i][j] = true;
		
		dfs(i-1, j, grid, l, w);
		dfs(i+1, j, grid, l, w);
		dfs(i, j-1, grid, l, w);
		dfs(i, j+1, grid, l, w);
		
		dfs(i-1, j-1, grid, l, w);
		dfs(i-1, j+1, grid, l, w);
		dfs(i+1, j-1, grid, l, w);
		dfs(i+1, j+1, grid, l, w);
	}
}
