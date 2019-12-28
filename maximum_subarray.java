/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

Code:
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0) return -1;
        //int result  =0;
        int[] newarr  = new int[nums.length];
        int max = nums[0];
        newarr[0] = nums[0];
        for(int i=1;i<nums.length;i++){
         newarr[i] = Math.max(nums[i],nums[i]+newarr[i-1]);
         max= Math.max(max,newarr[i]);
        }
        return max;
    }
}
