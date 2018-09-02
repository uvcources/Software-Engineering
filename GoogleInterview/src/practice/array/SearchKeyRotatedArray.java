package practice.array;

public class SearchKeyRotatedArray {

	public int searchElement(int array[], int low, int high, int key) {

		if (low > high) {
			return -1;
		}

		int pivot = (low + high) / 2;
		if (array[pivot] == key) {
			return pivot;
		}

		if (array[low] <= array[pivot]) {

			if (array[low] <= key && key <= array[pivot]) {
				return searchElement(array, low, pivot - 1, key);
			}
			return searchElement(array, pivot + 1, high, key);
		}

		if (key >= array[pivot] && key <= array[high]) {
			return searchElement(array, pivot + 1, high, key);
		}
		return searchElement(array, low, pivot - 1, key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 30, 40, 50, 60, 70, 80, 10, 20 };
		SearchKeyRotatedArray search = new SearchKeyRotatedArray();
		int index = search.searchElement(a, 0, a.length - 1, 30);
		System.out.println("Searched Element at " + index);
	}

}
