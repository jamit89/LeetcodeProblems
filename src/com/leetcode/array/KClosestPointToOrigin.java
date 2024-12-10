package com.leetcode.array;

import java.util.Arrays;

public class KClosestPointToOrigin {
	public static void main(String[] args) {
		Closest closest = new Closest();
		int points[][] = new int[][] { { 1, 3 }, { -2, 2 } };
		int k=1;
		closest.kClosest(points, k);
		System.out.println(Arrays.toString(points));
	}
}

class Closest {
	public int[][] kClosest(int[][] points, int k) {
		Arrays.sort(points, (p1, p2) -> Math.hypot(p1[0], p1[1]) - Math.hypot(p2[0], p2[1]) > 0 ? 1 : -1);
		return Arrays.copyOfRange(points, 0, k);
	}
}
