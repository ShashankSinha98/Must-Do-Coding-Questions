import java.util.Arrays;

public class MinimumPlatforms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findPlatform(new int[] {900, 940, 950, 1100, 1500, 1800},
				new int[]{910, 1200, 1120, 1130, 1900, 2000},6));
	}
	
	static int findPlatform(int arr[], int dep[], int n)
    {
		Arrays.sort(arr);
		Arrays.sort(dep);
		
        int maxPlatforms = 1;
        int currPlatformCount = 1;
        
        int i=1, j=0;
        
        while(i<n && j<n) {
        	
        	if(arr[i]<=dep[j]) {
        		currPlatformCount++;
        		if(currPlatformCount>maxPlatforms) maxPlatforms = currPlatformCount;
        		i++;
        	} else {
        		currPlatformCount--;
        		j++;
        	}
        }
        
        return maxPlatforms;
        
    }

}
