
public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = new MissingNumberInArray().MissingNumber(new int[] {1,2,3,4,5,6,7,8,10}, 10);
		System.out.println(ans);
	}
	
	int MissingNumber(int array[], int n) {
        // Your Code Here
		
		long totalSum = 0;
		totalSum = (n*(n+1))/2;
		
		
		for(int i=0; i<array.length; i++) totalSum-=array[i];
		
		return (int)totalSum;
    }

}
