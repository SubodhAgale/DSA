package sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] data = { 2, 6, 3, 34, 11, 83, 7, 1, 5 };
		System.out.println("\ndataay Before Sort :");
		printData(data);
		selectionSort(data);
		System.out.println("\ndataay After Sort :");
		printData(data);
	}

	// private static void selectionSort(int[] data) {
	// 	for (int i = 0; i < data.length; i++) {
	// 		int min_ind = i;
	// 		for (int j = i + 1; j < data.length; j++) {
	// 			if (data[min_ind] > data[j])
	// 				min_ind= j;
	// 		}
	// 		int temp = data[min_ind];
	// 		data[min_ind] = data[i];
	// 		data[i] = temp;
	// 	}

	// }

	private static void selectionSort(int[] data){
		for(int i = data.length -1; i>=0; i--){
			int max_ind=i;
			for(int j= i-1; j>=0; j--){
				if(data[j]>data[j+1])
					max_ind = j;				
			}
			int temp = data[max_ind];
			data[max_ind] = data[i];
			data[i] = temp;
		}
	}

	private static void printData(int[] data) {
		for (int i = 0; i < data.length; i++)
			System.out.print("  " + data[i]);
	}
}
