import java.util.Arrays;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] { 3,2,3 }, 6)));
	}

	public static int[] twoSum(int[] nums, int target) {
		List<Integer> num = Arrays.stream(nums).boxed().toList();
		System.out.println(num.toString());
		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			System.out.println(comp);
			if (num.contains(comp)&& i!=num.indexOf(comp)) {
				System.out.println(comp+" present");
				return new int[] {i, num.indexOf(comp)};
			}
		}
		return new int[] {};
	}
}