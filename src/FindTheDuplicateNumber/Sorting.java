package FindTheDuplicateNumber;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 2, 2};
		int length = nums.length;

		System.out.println(findDuplicate(nums, length));
	}

	static int findDuplicate(int[] nums, int length) {
		Arrays.sort(nums);

		for (int i = 1; i < length; i++) {
			if (nums[i] == nums[i - 1]) {
				return nums[i];
			}
		}

		return -1;
	}
}