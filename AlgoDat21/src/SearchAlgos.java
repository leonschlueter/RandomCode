public class SearchAlgos {

	public static int linearSearch(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearchRecursive(int[] A, int l, int r, int k) {
		if (r >= 1 && A.length - 1 > l) {

			int m = l + (r - l) / 2;

			if (k == A[m]) {
				return m;
			}
			if (A[m] < k) {
				return binarySearchRecursive(A, m + 1, r, k);
			} else {
				return binarySearchRecursive(A, l, m - 1, k);
			}
		}
		return -1;
	}
	
	public static int binarySearchIterative(int[] arr, int k) {
		int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == k)
                return m;
 

            if (arr[m] < k)
                l = m + 1;
 

            else
                r = m - 1;
        }
 
        return -1;
	}
}
