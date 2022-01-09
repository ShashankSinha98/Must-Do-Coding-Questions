
public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(equilibriumPoint(new long[] {1}, 1));
	}
	
	public static int equilibriumPoint(long arr[], int n) {

        int sum = 0;
        for(int i=1; i<n; i++) sum+=arr[i];
        
        if(sum==0) return 1;
        
        int ls = 0, rs = sum;
        
        for(int i=1; i<n; i++) {
        	ls+= arr[i-1];
        	rs-= arr[i];
        	
        	if(ls==rs) return i+1;
        }
        
        return -1;
    }

}
