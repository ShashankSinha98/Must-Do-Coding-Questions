
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(majorityElement(new int[] {3,3,3,1,2}, 5));
	}
	
	static int majorityElement(int a[], int size)
    {
        
		int element=-1;
        int count = 0;
		for(int i=0; i<size; i++) {
			if(count==0) {
				element = a[i];
				count++;
			} else if(a[i]==element) {
				count++;
			} else {
				count--;
			}
		}
		
		return isMajority(a, element)? element : -1;
    }
	
	private static boolean isMajority(int[] a, int x) {
		int cnt = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==x) {
				cnt++;
				if(cnt>a.length/2) return true;
			}
		}
		return false;
	}

}
