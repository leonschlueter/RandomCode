import java.util.Random;

public class ArrayGenerator {
	int[] arr;
	Random random;

	public ArrayGenerator(int n) {
		Random random = this.random;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt();
		}
	}

	public int[] Array() {
		return this.arr;
	}
}
