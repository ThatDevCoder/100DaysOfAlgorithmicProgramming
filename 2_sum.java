/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
        Example:
        Given nums = [2, 7, 11, 15], target = 9,

        Because nums[0] + nums[1] = 2 + 7 = 9,
        return [0, 1].
 */
 Solution :
  First Approach could be Brute Force comparing each element with rest of the array But the complexity it's complexity isn't good,
  Its O(n^2)
  
  
  Second approach
  Using Hasmaps as these have linear time complexity of O(1) and we have to loop through only for loop that is O(n)
  Therefore the time complexity is O(n)
  
Code:



class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i= 0;i<nums.length;i++)
        {
            int complement = target - nums[i];
            if(map.containsKey(complement))
            {
                result[1] = i;
                result[0] = map.get(complement);
                return result;
            }
            map.put(nums[i],i);
        }
    }
}
