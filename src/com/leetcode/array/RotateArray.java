package com.leetcode.array;

import java.util.Arrays;

public class RotateArray {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int nums[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		solution.rotateArray(nums, k);
		System.out.println(Arrays.toString(nums));

	}
}

class Solution {
	public void rotateArray(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		reverse(nums, 0, n - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, n - 1);
	}

	private void reverse(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}

	}

}
