package com.leetcode.array;

public class MaximumSubArray {
	public static void main(String[] args) {
		int[] num = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = MaximumSubArray(num);
		System.out.println(result);
	}

	public static int MaximumSubArray(int[] nums) {
		// TODO Auto-generated method stub
		int maxSoFar = nums[0];
		int currentSum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (currentSum < 0) {
				currentSum = 0;
			}
			currentSum = currentSum + nums[i];
			if (currentSum > maxSoFar) {
				maxSoFar = currentSum;
			}
		}

		return maxSoFar;
	}
}
