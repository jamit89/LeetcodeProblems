package com.leetcode.array;

import java.util.Arrays;

public class ArrayMethod2 {
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 30, 20, 3, 4, 5, 2, 1 };
		// it will sort all the element using Arrays.sort();
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,0,arr.length-3);
		System.out.println(Arrays.toString(arr));
	}
}
