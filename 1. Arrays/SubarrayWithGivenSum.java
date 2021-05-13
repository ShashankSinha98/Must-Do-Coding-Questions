import java.util.ArrayList;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(subarraySum(new int[] {1,2,3,4,5,6,7,8,9,10}, 10, 15));

	}
	
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int i=0, j=-1, sum=0;
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        
        while(true) {
        	if(sum<s) {
        		if(j+1>=n) return res;
        		
        		j++;
        		sum+=arr[j];
        	} 
        	
        	else if(sum>s) {
        		if(i+1>=n) return res;
        		
        		sum-=arr[i];
        		i++;
         	}
        	
        	else {
        		res.clear();
        		res.add(i+1);
        		res.add(j+1);
        		return res;
        	}
        }
    }

}
