Code:
//    Time Complexity: O(logn))
 
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        if(nums==null || nums.length==0) return result;
        result[0] = findLeft(nums,target);
        result[1] = findRight(nums,target);
        return result;
    }
    public int findLeft(int[] nums,int target)
    {   int index=-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {   
            int midpoint = start+(end-start)/2;
            if(nums[midpoint]>=target)
                end = midpoint-1;
            else
                start= midpoint+1;
            if(nums[midpoint]==target) index = midpoint;
        }
     return index;
    }  
    public int findRight(int[] nums,int target)
    {   int index=-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {   
            int midpoint = start+(end-start)/2;
            if(nums[midpoint]<=target)
                start = midpoint+1;
            else
                end = end -1;
            if(nums[midpoint]==target) index = midpoint;
        }
     return index;
    }
}
