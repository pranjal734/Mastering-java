package com.leetcode;

public class Twosum {
	public static int[] twoSum(int[] nums,int target) {
for(int i=0;i<nums.length-1;i++) {
	for(int j=i+1;j<nums.length-1;j++) {
		if(nums[i]+nums[j]==target) {
            return new int[] { i, j };
        }
    }
}
throw new IllegalArgumentException("No two sum solution");
	}
public static void main(String[] args) {
twoSum(7, 9);
}
}
