package FindTheDuplicateNumber;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1, 3, 4, 2, 2};
		System.out.println(findDuplicate(nums));
	}

	static int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];

		slow = nums[slow];
		fast = nums[nums[fast]];

		while (slow != fast) {
			slow = nums[slow];
			fast = nums[nums[fast]];
		}

		// First phase was completed

		slow = nums[0];
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}

		// Second phase was completed

		return fast;
	}
}