package practice.sorting;

public class InsertionSort {
	int key;
	public void insertionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) { 
			key=arr[i];
			for(int j=i-1;j>=i;j--) {
				if(arr[j]>key) {
					arr[j+1]=arr[j];
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
