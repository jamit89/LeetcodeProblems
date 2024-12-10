package com.leetcode.array;

import java.util.Arrays;

public class findMaxConsecutiveOnes {
	public static void main(String[] args) {
		int nums[] = { 1, 1, 0, 1, 1, 1 };
		int result=MaxConsecutiveOnes(nums);
		System.out.println(result);
	}

	private static int MaxConsecutiveOnes(int[] nums) {
		int maxCount=0;
        int CurrentCount=0;
        for(int num:nums)
        {
            if(num==1)
            {
                CurrentCount++;
            }
            else
            {
                maxCount=Math.max(maxCount, CurrentCount);
                CurrentCount=0;
            }
        }
        maxCount=Math.max(maxCount,CurrentCount);
        return maxCount;
	}
}
