
public class JumpingCaterpillars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	long uneatenLeaves(long arr[], int n,int k)
    {
        boolean[] isEaten = new boolean[n+1];
        long unEatenLeaves = 0;
        
        for(int i=0; i<k; i++) {
        	long temp = arr[i];
        	while(temp<=n) {
        		
        		isEaten[(int)temp] = true;
        		temp+=arr[i];
        	}
        }
        
        for(int i=1; i<n; i++) {
        	if(!isEaten[i]) unEatenLeaves++;
        }
        
        return unEatenLeaves;
    }

}
