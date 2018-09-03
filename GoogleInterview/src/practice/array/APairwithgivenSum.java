package practice.array;

public class APairwithgivenSum {
	public boolean isPairwithSum(int array[], int sum) {
		boolean result = false;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] + array[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 50, 60, 70, 10, 20, 30, 40 };
		APairwithgivenSum pair = new APairwithgivenSum();
		System.out.println(pair.isPairwithSum(a, 710));
	}

}
