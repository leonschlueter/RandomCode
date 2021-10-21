
import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] res = twoSumTriv(nums, target);
		System.out.println(Arrays.toString(res));
	}

	public static int[] twoSumTriv(int[] nums, int target) {
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					res[0] = i;
					res[1] = j;
				}
			}
		}

		return res;
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				return result;
			}
			map.put(nums[i], i);
		}
		return result;
	}
}
