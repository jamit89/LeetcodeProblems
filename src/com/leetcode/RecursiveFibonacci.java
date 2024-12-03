package com.leetcode;

import java.util.Scanner;

public class RecursiveFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i < num; i++) {
			System.out.println("fibonacci of " + i + " is " + fibonacci(i));
		}
	}

	private static int fibonacci(int num) {

		if (num == 1 || num == 2) {
			return 1;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
}
