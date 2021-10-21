import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		ArrayGenerator ag = new ArrayGenerator(10);
		int[] arr = ag.getArray();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int index = SearchAlgos.binarySearchRecursive(arr, 0, arr.length - 1, arr[7]);
		System.out.println(index);
		System.out.println(SearchAlgos.binarySearchIterative(arr, arr[7]));
	}

}
