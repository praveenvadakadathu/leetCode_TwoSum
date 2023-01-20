import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 5, 5, 11 }, 10)));
	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {

			for (int j = 1; j < nums.length; j++) {

				if ((nums[i] + nums[j] == target) && i != j) {

					return new int[] { i, j };
				}
			}
		}
		return new int[0];
	}
}