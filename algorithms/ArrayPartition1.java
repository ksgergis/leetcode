import java.util.Arrays;

class Solution {

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int loc = 0; loc < nums.length; loc += 2) {
			sum += nums[loc];
		}
		return sum;
	}
}