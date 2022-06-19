
public class MinimumOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = minOperation(5);
		System.out.println("Ans: "+ans);
	}
	
	public static int minOperation(int n)
    {
		int count = 0;
		
		while(n!=0) {
			if(n%2==0) {
				n/=2;
			} else {
				n-=1;
			}
			count++;
		}
		return count;
    }

}
