
public class CustomDisplay {

	static void print2DArray(Object[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+", ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
