package com.leetcode;

public class SpaceComplexity {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 6 };
		function(arr);
	}

	public static void function(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int num = arr[i] * 2;
			System.out.println(num);

		}
	}
}
