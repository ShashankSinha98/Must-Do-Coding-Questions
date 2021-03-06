import java.util.Arrays;

public class MergeWithoutExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shell_merge(new long[] {1, 36, 39, 105, 146, 154, 168, 170, 204, 206, 217, 219, 225, 227, 272, 282, 293, 300, 312, 323, 328, 328, 334, 335, 359, 370, 383, 392, 395, 396, 403, 413, 422, 437, 443, 448, 462, 463, 465, 479, 492, 496}, 
				new long[] {7 ,22 ,30 ,36 ,38 ,38,39 ,41 ,42, 48, 49, 83, 85, 102 ,107 ,116 ,119, 124, 127, 130, 140, 142, 145, 149, 159 ,163 ,165, 174, 174 ,191 ,205 ,212, 224, 230, 242, 246, 254 ,257 ,258, 265, 279, 289 ,306, 307, 309, 317 ,324 ,334 ,341 ,343 ,351, 360, 369, 371, 377, 387, 391, 394, 430, 431, 432, 440, 443, 445, 447, 455, 467, 478},
				42, 68);
		
		
	}
	
	public static void merge(long arr1[], long arr2[], int n, int m) 
    {
       
		int i=0, j=0;
		
		while(i<n) {
			
			if(arr1[i] < arr2[j]) {
				i++;
			} else {
				
				// swap
				long temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				
				// place in right place at A2
				for(int k=0; k<m-1; k++) {
					if(arr2[k]>arr2[k+1]) {
						long temp2 = arr2[k];
						arr2[k] = arr2[k+1];
						arr2[k+1] = temp2;
					}
				}
				
				i++;
			}
			
		}
		System.out.println("A1: "+Arrays.toString(arr1));
		System.out.println("A2: "+Arrays.toString(arr2));

    }
	
	
	public static void shell_merge(long arr1[], long arr2[], int n, int m) {
		
		int gap = (int) Math.ceil((n+m)/2);
		
		while(gap!=0) {
			
			for(int i=0; i<(n+m)-gap; i++) {
//				int st = (i<n)? i : i-n;
//				int j = (st+gap<n)? st+gap : n-(st+gap);
				
				int j = i+gap;
				
				// case 1- i and j both in arr1
				if(i<n && j<n) {
					if(arr1[i]>arr1[j]) {
						swap(arr1,i,j);
						
						int k = i;
						while(k-gap>=0 && arr1[k-gap]>arr1[k]) {
							swap(arr1,k,k-gap);
							k = k-gap;
						}
					}
				}
				
				// case 2- i in arr1 and j in arr 2
				else if(i<n && j>=n) {
					
					j = j-n;
					
					if(arr1[i]>arr2[j]) {
						long temp = arr1[i];
						arr1[i] = arr2[j];
						arr2[j] = temp;
						
						int k = i;
						while(k-gap>=0 && arr1[k-gap]>arr1[k]) {
							swap(arr1,k,k-gap);
							k = k-gap;
						}
						
					}
				}
				
				// case 3- both i and j in arr2
				else if(i>=n && j>=n) {
					
					int st = i-n;
					j = j-n;
					
					if(arr2[st]>arr2[j]) {
						swap(arr2, j, st);
						
						int k = st+n;
						while(k-gap>=0) {
							//System.out.println("k: "+k+", gap: "+gap);
//							int _k1 = (k>=n)? k-n:k;
//							int _k2 = (k-gap>=n)? (k-gap-n):k-gap;
							
							// case 3.1 - both k-gap and k are in arr2
							if(k>=n && k-gap>=n) {
								if(arr2[k-gap-n]>arr2[k-n]) {
									swap(arr2, k-n, k-gap-n);
									k = k-gap;
								} else break;
							}
							
							// case 3.2 - both k-gap and k are in arr1 
							if(k<n && k-gap<n) {
								
								if(arr1[k-gap]>arr1[k]) {
									swap(arr1,k,k-gap);
									k = k-gap;
								} else break;
								
							}
							
							// case 3.3 - k-gap in arr1 and k in arr2
							
							if(k-gap<n && k>=n) {
								
								
								if(arr1[k-gap]>arr2[k-n]) {
									
									long temp = arr1[k-gap];
									arr1[k-gap] = arr2[k-n];
									arr2[k-n] = temp;
									
									k = k-gap;
								} else break;
								
							}
							
							
							
						}
					}
					
				}
				
			}	
			
			gap = (int)Math.ceil(gap/2);
			
			
		}
		System.out.println("A1: "+Arrays.toString(arr1));
		System.out.println("A2: "+Arrays.toString(arr2));
		
	}
	
	private static void swap(long[] arr, int pos1, int pos2) {
		long temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}

}
