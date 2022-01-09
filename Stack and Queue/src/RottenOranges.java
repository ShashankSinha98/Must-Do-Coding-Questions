import java.util.*;

public class RottenOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(orangesRotting(
				new int[][] { {2, 1, 0, 2, 1},
                    {1, 0, 1, 2, 1},
                    {1, 0, 0, 2, 1}}));
	}
	
	static class Item {
		int x, y, time;
		
		public Item(int x, int y, int time) {
			this.x = x;
			this.y = y;
			this.time = time;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "(x: "+x+", y: "+y+" t: "+time+") ";
		}
	}

	
    public static int orangesRotting(int[][] grid)
    {
    	int freshOrangeCount = 0;
    	int m = grid.length;
    	int n = grid[0].length;
    	
    	Queue<Item> q = new LinkedList<>();
    	
    	for(int x=0; x<m; x++) {
    		for(int y=0; y<n; y++) {
    			if(grid[x][y]==1) freshOrangeCount++;
    			else if(grid[x][y]==2) q.add(new Item(x, y, 0));
    		}
    	}
    	
    	
    	int minTime = 0;
    	while(freshOrangeCount!=0 && !q.isEmpty()) {
    		
    		Item it = q.poll();
    		
    		// maxTime = Math.max(maxTime, it.time);
    		
    		// check all 4 directions 
    		// check Top
    		if(check(it.x-1, it.y, m, n, grid, it.time)!=null) {
    			q.add(check(it.x-1, it.y, m, n, grid, it.time));
    			minTime = Math.max(minTime, it.time+1);
    			grid[it.x-1][it.y] = 2;
    			freshOrangeCount--;
    		}
    		
    		// Check Bottom
    		if(check(it.x+1, it.y, m, n, grid, it.time)!=null) {
    			q.add(check(it.x+1, it.y, m, n, grid, it.time));
    			minTime = Math.max(minTime, it.time+1);
    			grid[it.x+1][it.y] = 2;
    			freshOrangeCount--;
    		}
    		
    		// check left
    		if(check(it.x, it.y-1, m, n, grid, it.time)!=null) {
    			q.add(check(it.x, it.y-1, m, n, grid, it.time));
    			minTime = Math.max(minTime, it.time+1);
    			grid[it.x][it.y-1] = 2;
    			freshOrangeCount--;
    		}
    		
    		// Check Right
    		if(check(it.x, it.y+1, m, n, grid, it.time)!=null) {
    			q.add(check(it.x, it.y+1, m, n, grid, it.time));
    			minTime = Math.max(minTime, it.time+1);
    			grid[it.x][it.y+1] = 2;
    			freshOrangeCount--;
    		}
    	
    	}
   
    	return (freshOrangeCount==0)?minTime:-1;
    }
    
    private static Item check(int x, int y, int m, int n, int[][] arr, int time) {
    	
    	if(x<0 || x>=m || y<0 || y>=n || arr[x][y]!=1) {
    		
    		return null;}
    	
    	return new Item(x,y,time+1);
    }


}
