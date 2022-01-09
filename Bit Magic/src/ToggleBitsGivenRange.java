
public class ToggleBitsGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(toggleBits(50, 2, 5));
	}
	
	static int toggleBits(int N , int L , int R) {
       
		for(int pos=L-1; pos<=R-1; pos++) {
			if(getBit(N, pos)==0) {
				N = N | (1<<pos);
			} else {
				N = N & ~(1<<pos);
			}
			
		}
		return N;
    }
	
	static int getBit(int N, int pos) {
		return (N & (1<<pos))==0? 0:1;
	}
	
	

}
