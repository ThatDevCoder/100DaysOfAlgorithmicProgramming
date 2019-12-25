/*
Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.


            Example:

            Given array nums = [-1, 2, 1, -4], and target = 1.

            The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
            */
            
            
 Solution:
    Time complexity: O(n^2)
    I know its ridiculous but it is what it is.
 
 Code:-
 class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // int result=0;
        if(nums==null || nums.length==0) 
            throw new IllegalArgumentException("Invalid Input");
        if(nums.length<3)
            throw new IllegalArgumentException("Invalid Input");
        Arrays.sort(nums);
        int closest  = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++)
        {
            int low = i+1;
            int high = nums.length-1;
          
            while(low<high)
            {  int sum = nums[i]+nums[low]+nums[high];
                if(Math.abs(sum-target)<Math.abs(closest-target))
                {
                    closest = sum;
                }
                else if(sum==target)
                    return sum;
                else if(sum<target)
                    low++;
                else
                    high--;
            }
            
    }
        
       return closest; 
    }

}
