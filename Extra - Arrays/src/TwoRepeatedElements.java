
public class TwoRepeatedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair res = new TwoRepeatedElements().twoRepeated(new int[] {1,2,2,1}, 2);
		System.out.println(res);
	}
	
	class Pair {
		public int first;
		public int second;
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "f: "+first+", s: "+second;
		}
	}
	
	public Pair twoRepeated(int arr[], int N)
    {
        Pair res = new Pair();
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[Math.abs(arr[i])]>0) {
        		arr[Math.abs(arr[i])] *= -1;
        	} else { // arr[i] is repeating
        		if(res.first==0) res.first = Math.abs(arr[i]);
        		else res.second = Math.abs(arr[i]);
        	}
        }
        
        return res;
        
    }

}
