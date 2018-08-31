package practice.array;

public class ArrayLeftRotation {
 
	
	public void arrayRotate(int array[],int dist) { 
		
		for(int i=0;i<dist;i++) {
			leftRotate(array);
		}
	}
	public void leftRotate(int array[]) {
		int i=0,temp=0; 
		temp=array[0];
		for(i=0;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		array[i]=temp;
	} 
	
	public void display(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
	
	public static void main(String[] args) {
		
       int array[]= {10,20,30,40,50,60,70}; 
       ArrayLeftRotation arr =new ArrayLeftRotation();
       arr.arrayRotate(array,2);
       arr.display(array);
	}

}
