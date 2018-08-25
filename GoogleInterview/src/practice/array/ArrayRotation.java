package practice.array;

public class ArrayRotation {
	void printList(int arr[][]) {
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				//arr[row][col] = arr[3 - col - 1][row];
				System.out.println(arr[col][row]);
			}
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7,8, 9} };
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				arr[row][col] = arr[3 - col - 1][row];
			}
		}
		ArrayRotation rr=new ArrayRotation();
		rr.printList(arr);
	} 
	
}
