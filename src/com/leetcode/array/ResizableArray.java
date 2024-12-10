package com.leetcode.array;

import java.util.ArrayList;

// capicity =2 suppose 
// size=0
// basically it will will hold the memory space in arraylist when ever 
// we will add new element then size and capicity will will be increased based on add the element in arraylist 
public class ResizableArray {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(5);
		arr.add(13);
		arr.add(7);
		arr.add(15);
		System.out.println(arr);
	}
}
