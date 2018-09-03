package practice.array;

public class APairwithgivenSum02 {
	public boolean isPairwithSum(int array[], int sum) {
		boolean result = false; 
	 int i=0;
	 int n=array.length; 
	 int low,high;
		for(i=0;i<n-1;i++) {
			if(array[i]>array[i+1]) {
				break;
			}
		} 
		low=(i+1)%n;
		high=i;
		
		while(low!=high) {
			if(array[low]+array[high]==sum) {
				return true;
			}
			
			if(array[low]+array[high]<sum) {
				low=(low+1)%n;
			}else 
				high=(n+high-1)%n;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 11, 15, 6, 8, 9, 10 };
		APairwithgivenSum02 pair = new APairwithgivenSum02();
		System.out.println(pair.isPairwithSum(a, 15));
	}
}
