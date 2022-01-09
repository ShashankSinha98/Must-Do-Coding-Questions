
public class FindFirstSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getFirstSetBit(18));
	}
	
	public static int getFirstSetBit(int n){
        
		if(n==0) return n;
		
        int cnt=0;
        
        while((n & (1<<cnt))==0) {
        	cnt++;
        }
        
        return cnt+1;       
    }

}
