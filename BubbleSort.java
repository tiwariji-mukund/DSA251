package BasicAlgorthms;

public class BubbleSort {

	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,6,3,9,4,8,1,7};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}

}
