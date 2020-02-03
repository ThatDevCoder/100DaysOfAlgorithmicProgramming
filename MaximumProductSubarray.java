/*
Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
*/

class Solution {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int ans = nums[0];
        int prevMax = nums[0];
        int prevMin = nums[0];
        for(int i=1;i<nums.length;i++){
            currMax = Math.max(Math.max((prevMax*nums[i]),(prevMin*nums[i])),nums[i]);
            currMin = Math.min(Math.min((prevMax*nums[i]),(prevMin*nums[i])),nums[i]);
            ans = Math.max(ans,currMax);
            prevMax = currMax;
            prevMin = currMin;
        }
        return ans;
    }
}
