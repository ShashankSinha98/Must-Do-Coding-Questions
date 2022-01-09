import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sort s = new Sort();

		int[] arr = new int[1000];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		//System.out.println(Arrays.toString(arr));

		
		  s.shuffle(arr);
		  
		  long time=0; for(int i=0; i<10; i++) { long start = System.nanoTime();
		  s.ShellSort(arr); long end = System.nanoTime();
		  
		  time+=(end-start); }
		 

		// s.ShellSort(arr);

		System.out.println(Arrays.toString(arr));
		 System.out.println("Time taken in ms: "+(time)/100000000);

	}

}
