package practice.array;

public class ArrayRightRotation {
public void rotate(int array[],int dist) {
	for(int i=0;i<dist;i++) {
		
	}
}

public void rightRotate(int array[]) {
	int i=0,temp=0;
	int n=array.length; 
	temp=array[n];
	for(i=n-1;i>0;i--) {
		array[n-1]=array[n];
	} 
	array[i]=temp;
}
public void display(int ar[]) {
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int array[]= {10,20,30,40,50,60,70}; 
		 ArrayRightRotation arr=new ArrayRightRotation();
		 arr.rotate(array, 2);
		 
		 
	}

}
