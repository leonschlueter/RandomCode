import java.util.Random;

public class ArrayGenerator {
	int[] arr;
	Random random;

	public ArrayGenerator(int n) {
		this.random = new Random();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
		}
		this.arr = arr;
	}

	public int[] getArray() {
		return this.arr;
	}
}
