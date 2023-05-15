package BasicAlgorthms;

public class SelectionSort {

	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void selectionSort(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int min = arr[i];
			int minIndex = i;
			for(int j=i; j<arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,6,3,9,4,8,1,7};
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
	}

}
