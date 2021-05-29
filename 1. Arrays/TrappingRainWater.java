
public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(trappingWater(new int[] {3,0,0,2,0,4}, 6));
	}
	
	static int trappingWater(int arr[], int n) { 
        
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++) {
        	
        	if(arr[i]>max) 
        		max = arr[i];
        	
        	leftMax[i] = max;
        }
        
        max = Integer.MIN_VALUE;
        
        for(int i=n-1; i>=0; i--) {
        	
        	if(arr[i]>max) 
        		max = arr[i];
        	
        	rightMax[i] = max;
        }
        
        
        int waterCount = 0;
        
        for(int i=1; i<n-1; i++) {
        	
        	int localWaterCount = Math.min(leftMax[i], rightMax[i]) - arr[i];
        	
        	if(localWaterCount>0) waterCount+= localWaterCount;
        	
        }
        
        return waterCount;
    }

}
