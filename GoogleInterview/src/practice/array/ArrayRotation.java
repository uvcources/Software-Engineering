package practice.array;

public class ArrayRotation {
	void printList(int arr[][]) {
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				//arr[row][col] = arr[3 - col - 1][row];
				System.out.println(arr[row][col]);
			}
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotation rr=new ArrayRotation();
	//	int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7,8, 9} }; 
		int matrix[][] = { { 5,1,9,11 }, { 2,4,8,10}, { 13,3,6,7},{15,14,12,16}}; 
		//int rotated[][]=new int[arr.length][arr.length];
		
		System.out.println("Before Rotation");
		rr.printList(matrix);
	     int len =matrix.length;
		for (int row = 0; row < len/2; row++) {
			for (int col = 0; col < Math.ceil(((double) len) / 2.); col++) { 
				int temp= matrix[row][col];
				matrix[row][col] = matrix[len-1-col][row]; 
				matrix[len-1-col][row]=matrix[len-1-row][len-1-col];
				matrix[len-1-row][len-1-col]=matrix[col][len-1-row];
				matrix[col][len-1-row]=temp;
			}
		}
		
		
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
		
		
		
		System.out.println("After Rotation");
		rr.printList(matrix);
		//System.out.println(arr.length); 
	} 
	
}
