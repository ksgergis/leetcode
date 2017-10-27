

//question link https://leetcode.com/problems/median-of-two-sorted-arrays/description/

class Solution {
public  double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double length = nums1.length + nums2.length;
		double medianIndex = length / 2;
		double median = 0;
		int num1Index = 0;
		int num2Index = 0;
		int currentNumber = 0;
		for (int index = 0; index <= medianIndex; index++) {
			if (num1Index >= nums1.length) {
				currentNumber = nums2[num2Index];
				num2Index++;
			} else if (num2Index >= nums2.length) {
				currentNumber = nums1[num1Index];
				num1Index++;
			} else if (nums1[num1Index] <= nums2[num2Index]) {
				currentNumber = nums1[num1Index];
				num1Index++;
			} else {
				currentNumber = nums2[num2Index];
				num2Index++;
			}
			if (length % 2 == 0 && index == medianIndex - 1) {
				median = currentNumber;
			}

		}
		if (length % 2 == 0) {
			System.out.println(median);
			System.out.println(currentNumber);
			median = ((double) (median + currentNumber)) / 2;
			System.out.println("a7a");
		} else {
			median = currentNumber;
		}

		return median;
	}
}
