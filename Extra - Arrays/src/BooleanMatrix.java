
public class BooleanMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void booleanMatrix(int matrix[][])
    {
        boolean rowFill = false;
        boolean columnFill = false;
        
        for(int r=0; r<matrix.length; r++) {
        	for(int c=0; c<matrix[0].length; c++) {
        		
        		if(r==0 && matrix[r][c]==1) rowFill = true;
        		
        		if(c==0 && matrix[r][c]==1) columnFill = true;
        		
        		if(matrix[r][c]==1) {
        			matrix[r][0] = 1;
        			matrix[0][c] = 1;
        		}
        		
        	}
        }
        
        
        for(int r=1; r<matrix.length; r++) {
        	for(int c=1; c<matrix[0].length; c++) {
        		
        		if(matrix[r][0]==1 || matrix[0][c]==1) {
        			matrix[r][c] =1;
        		}
        	}
        }
        
        if(rowFill) {
        	for(int r=0; r<matrix.length; r++) matrix[r][0] = 1; 
        }
        
        if(columnFill) {
        	for(int c=0; c<matrix[0].length; c++) matrix[0][c]=1;
        }
    }

}
