package practice.sorting;

public class SelectionSort {  
	
	
	public void selectionSort(int arr[]) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[j] < arr[i]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
		} 
		printList(arr);
	}
	public void printList(int arr[]) { 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		SelectionSort s=new SelectionSort();  
		int arr[] = {64,25,12,22,11};
		
		s.selectionSort(arr);
  
	}

}
