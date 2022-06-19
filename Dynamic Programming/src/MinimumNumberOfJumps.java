
public class MinimumNumberOfJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 9 10 1 2 3 4 8 0 0 0 0 0 0 0 1
		int[] arr = new int[] {9, 10, 1, 2, 3, 4, 8, 0, 0, 0, 0, 0, 0, 0, 1};
		int ans = minJumps(arr);
		System.out.println("Ans: "+ans);

	}
	
	static int minJumps(int[] arr) {
		
		int N = arr.length;
		
		if(N==1) return 0;
		
		if(arr[0]==0) return -1;
		
		int maxReach=arr[0], stepsAvailable=arr[0], jumpsTaken=1;
		
		for(int i=1; i<N; i++) {
			
			stepsAvailable--;
			
			if(i==N-1) return jumpsTaken;
			
			maxReach = Math.max(maxReach, i+arr[i]);
			
			
			
			if(stepsAvailable==0) {
				if(i>=maxReach) return -1;
				jumpsTaken++;
				stepsAvailable = maxReach - i;
			}
		}
		
		return -1;
		
    }

}
