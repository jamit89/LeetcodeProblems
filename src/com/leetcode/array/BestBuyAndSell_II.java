package com.leetcode.array;

public class BestBuyAndSell_II {
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};  // Example input
        System.out.println("Maximum profit: " + maxProfit(prices)); 
	}

	private static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub
		int profit=0;
		for (int i = 1; i < prices.length; i++) {
			if(prices[i]>prices[i-1])
			{
				profit=profit+prices[i]-prices[i-1];
			}
		}
		return profit;
	}
}
