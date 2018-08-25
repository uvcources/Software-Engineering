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
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7,8, 9} }; 
		int rotated[][]=new int[arr.length][arr.length];
		ArrayRotation rr=new ArrayRotation();
		System.out.println("Before Rotation");
		rr.printList(arr);
	
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				rotated[row][col] = arr[(arr.length-1)-col][row];
			}
		}
		System.out.println("After Rotation");
		rr.printList(rotated);
		//System.out.println(arr.length);
	} 
	
}
