
public class CountTotalSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countSetBits(17));
	}
	
	public static int countSetBits(int n){
	    
		if(n==0) return 0;
		
        int x = getMaxPowerOf2(n);
        
        return ((1<<(x-1))*x) + (n-(1<<x)+1) + countSetBits(n-(1<<x)); 
        
    }
	
	public static int getMaxPowerOf2(int n) {
		int x=0;
		
		while((1<<x)<=n) {
			x++;
		}
		
		return x-1;
	}

}
