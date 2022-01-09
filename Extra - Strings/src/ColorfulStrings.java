import java.util.Arrays;

public class ColorfulStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(possibleStrings(9, 0, 2, 5));
	}
	
	static long possibleStrings(int n, int r, int b, int g) {
        
		long[] fact = new long[21];
		fact[0] = 1;
		for(int i=1; i<fact.length; i++) {
			fact[i] = i*fact[i-1];
		}
		
		int left = n-(r+b+g);
		long res=0;
		
		for(int rx=0; rx<=left; rx++) {
			for(int bx=0; bx<=left-rx; bx++) {
				int gx = left-(rx+bx);
				
				res+= fact[n]/(fact[r+rx]*fact[b+bx]*fact[g+gx]);
			}
		}
		
		return res;
		
    }
	
	}
