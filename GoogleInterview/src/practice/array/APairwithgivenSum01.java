package practice.array;

public class APairwithgivenSum01 {
	public boolean isPairwithSum(int array[], int sum) {
		boolean result = false; 
		int left,right;
		
		left=0;right=array.length-1;
		
		while(left<right) {
			if(array[left]+array[right]==sum) {
				return true; 
			}else if(array[left]+array[right]>sum){
				right--;
			}else if(array[left]+array[right]<sum){
				left++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 11, 15, 6, 8, 9, 10 };
		APairwithgivenSum01 pair = new APairwithgivenSum01();
		System.out.println(pair.isPairwithSum(a, 16));
	}

}
