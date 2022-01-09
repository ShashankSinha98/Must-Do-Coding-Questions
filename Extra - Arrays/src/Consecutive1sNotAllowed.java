
public class Consecutive1sNotAllowed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countStrings(1));
	}
	
	static long countStrings(int n) {
        
		long MOD = 1000000007;
		long prevZeroCount = 1;
		long prevOneCount = 1;
		long currZeroCount = 1;
		long currOneCount = 1;
		
		
		for(int i=2; i<=n; i++) {
			currZeroCount = (prevOneCount + prevZeroCount)%MOD;
			currOneCount = prevZeroCount;
			
			prevZeroCount = currZeroCount;
			prevOneCount = currOneCount;
		}
		
		return (currOneCount + currZeroCount)%MOD;
    }

}
