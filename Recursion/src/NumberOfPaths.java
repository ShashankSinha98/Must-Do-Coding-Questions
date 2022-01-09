
public class NumberOfPaths {

	public static void main(String[] args) {
		
		long res = numberOfPaths(10, 10);
		System.out.println("res: "+res);
	}
	
	static long numberOfPaths(int m, int n) {
        return fn(m-1,n-1);
    }

	static long fn(int m, int n) {
		// base case
		if(m==0 && n==0) return 1;
		
		// out of grid
		if(m<0 || n<0) return 0;
		
		return fn(m-1, n) + fn(m, n-1);
	}
}
