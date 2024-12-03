package com.leetcode;

import java.util.Scanner;

public class RecursiveFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int result = fact(num);
		System.out.println(result);
	}

	private static int fact(int num) {
		// TODO Auto-generated method stub
		if (num == 1) {
			return 1;
		} else {
			return num * fact(num - 1);
		}
	}
}
