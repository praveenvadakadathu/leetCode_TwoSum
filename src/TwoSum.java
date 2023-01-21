import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 2, 5, 9 }, 11)));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> comps = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			if (comps.containsKey(nums[i])) {
				return new int[] { comps.get(nums[i]), i };
			}
			comps.put(comp, i);
		}
		return new int[0];
	}
}