
public class MinOperationWith3Allowed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = minOperation(15);
		System.out.println("Ans: "+ans);
	}
	
	static int minOperation(int n) {
		int c=0;
		
		while(n!=1) {
			if(n%3==0) {
				c++;
				n/=3;
			} else if(n%2==0) {
				c++;
				n/=2;
			} else {
				c++;
				n--;
			}
		}
		
		return c;
	}

}
