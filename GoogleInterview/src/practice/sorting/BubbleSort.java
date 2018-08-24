package practice.sorting;

public class BubbleSort { 
	
	public void bubbleSort(int arr[]) {
		boolean issorted=true;
		
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) { 
					
					int temp=arr[j]; 
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					issorted=false;
					
				}
			} 
			if(issorted) {
				System.out.println("Break"); 
				break;
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
		int arr[] = {64,25,12,22,11};
		int arr1[] = {1,2,3,4,5,6};
		BubbleSort b=new BubbleSort();
		b.bubbleSort(arr);
		b.bubbleSort(arr1);
	}

}
