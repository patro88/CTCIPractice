package ctci.arrayAndString;
public class MatrixRotate {

	class Matrix {
		 
		 int[][] val;
		 int size;
		 
		 public Matrix(int s) {
		 	size = s;
		 	val = new int[s][s];
		 } 
		 
		 public Matrix(int s, int[] values) {
		 	size = s;
		 	val = new int[s][s];
		 	for(int i =0 ;i<s; i++) {
		 		for(int j =0 ;j<s; j++) 	{
		 			val[i][j] = values[i*s+j];
		 		}
		 	} 
		 }
		 
		 public void printMatrix(){
		 	for(int i = 0 ;i<size; i++) {
		 		for(int j = 0 ;j<size; j++) 	{
		 			System.out.print(val[i][j] + " ");
		 		}
		 		System.out.println();
		 	} 
		 }
		 
		 public void rotateMatrix() {
		 	//create new matrix
		 	Matrix mnew = new Matrix(size);
		 	
		 	//for each row in old (0-n), create a column in new(n -0)
		 	for( int i=0 ; i < size ; i++) {
		 		for(int j=size-1; j>0; j--) {
		 			mnew.val[j][i] = val[i][size-j-1];
		 		}
		 	}
		 	
		 	for(int i = 0 ;i<size; i++) {
		 		for(int j = 0 ;j<size; j++) 	{
		 			System.out.print(mnew.val[i][j] + " ");
		 		}
		 		System.out.println();
		 	} 
		 	
		 }
		 
	}

	public static void main(String args[]){
		Matrix m = new MatrixRotate().new Matrix(3, new int[]{1,2,3,4,5,6,7,8,9});
		m.printMatrix(); 
		System.out.println();
		m.rotateMatrix();
	}
}