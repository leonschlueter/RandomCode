import java.util.Arrays;

public class DPAlgos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayGenerator ag = new ArrayGenerator(5);
		int[] arr = ag.getArray();
		boolean canBeSubsetSum = subsetSum(arr, 2);
		System.out.println(Arrays.toString(ag.getArray()));

		System.out.println(canBeSubsetSum);
	}

	private static boolean subsetSum(int[] array, int b) {
		boolean[][] DP = new boolean[array.length + 1][b + 1];
		for (int i = 0; i < DP[0].length; i++) {
			DP[0][i] = false;
		}
		for (int i = 0; i < DP.length; i++) {
			DP[i][0] = true;
		}

		for (int i = 1; i < DP.length; i++) {
			for (int j = 1; j < DP[0].length; j++) {

				//System.out.println(i + " " + j + " " + array[i-1]);
				DP[i][j] = DP[i - 1][j];
				if (j - array[i - 1] >= 0)
					DP[i][j] = DP[i - 1][j] || DP[i - 1][j - array[i - 1]];
			}
		}
		System.out.println("DP table: ");
		for (boolean[] x : DP) {
			System.out.print("[ ");
			for (boolean y : x) {
				if(y)
				System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.print("]");
			System.out.println();
		}
		return DP[DP.length - 1][b];
	}

}
