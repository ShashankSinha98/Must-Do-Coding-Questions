import java.util.Arrays;

public class ConvertArrayIntoZigZagFashion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		new ConvertArrayIntoZigZagFashion()
		.zigZag(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}
	
	void zigZag(int arr[], int n) {
       
		boolean great = false;
		int i=0, j=1;
		
		while(i<n && j<n) {
			
			if(!great) {
				if(arr[i]>arr[j]) swap(arr,i,j);
			} else {
				if(arr[i]<arr[j]) swap(arr,i,j);
			}
			great = !great;
			i++; j++;
		}
    }
	
	private void swap(int[] arr, int p1, int p2) {
		int temp = arr[p1];
		arr[p1] = arr[p2];
		arr[p2] = temp;
	}

}
