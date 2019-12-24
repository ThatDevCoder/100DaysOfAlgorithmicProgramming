Similiar to 3 sum and 2 sum 
 
 PS:- 
 I know I have done in O(n^3) time complexity but it can be done in O(n^2) time complexity also
 Just use HashMaps while finding the sum that is equal to the target.
 So it will save us one extra for/while loop
 
 
 
 
 Code:
 
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        if(nums==null||nums.length==0) return output;
        if(nums.length<4)
            return output;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            if((i>0&&nums[i]==nums[i-1]))
                continue;
            for(int j=i+1;j<nums.length-2;j++)
            {
                if((j>i+1)&&nums[j]==nums[j-1])
                    continue;
                int low = j+1;
                int high = nums.length-1;
                int sum = target-nums[i]-nums[j];
                while(low<high)
                {
                    if(nums[low]+nums[high]==sum)
                    {
                    output.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                    while(low<high&&nums[low]==nums[low+1]) low++;
                    while(low<high&&nums[high]==nums[high-1])  high--;
                    low++;
                    high--;
                    }
                    else if(nums[low]+nums[high]>sum)
                        high--;
                    else
                        low++;
                }
                    
            }
        }
      return output;  
    }
}
