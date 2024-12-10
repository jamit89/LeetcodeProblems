package com.leetcode.array;

public class BestBuyAndBestSell {
	public static void main(String[] args) {
		int[] nums = new int[] { 7, 1, 5, 3, 6, 4 };
		int result = maxProfit(nums);
		System.out.println(result);
	}

	public static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub
		int minSofar = prices[0];
		int ans = 0;
		for (int i = 1; i < prices.length; i++) {
			int profit = prices[i] - minSofar;
			if (profit > ans) {
				ans = profit;
			}
			minSofar = Math.min(prices[i], minSofar);
		}
		return ans;
	}
}
