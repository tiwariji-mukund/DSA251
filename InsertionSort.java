package BasicAlgorthms;

public class InsertionSort {

	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void insertionSort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int value = arr[i];
			int j = i-1;
			while(j>-1 && arr[j] > value) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,6,3,9,4,8,1,7};
		printArray(arr);
		insertionSort(arr);
		printArray(arr);
	}

}
