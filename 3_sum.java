Very Similar to 2 sum just we have to do it for 3 sum to get 0 



Code:-

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);   
        if(nums.length<3)return list;
        for(int i=0; i<n-2 ;i++){ if(i==0 || (i>0 && nums[i]!=nums[i-1])){          
                int low = i+1;
                int high = n-1;
                int sum = 0-nums[i];
         while(low<high){
                    if(nums[low]+nums[high]==sum){
                        list.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low<high && nums[low]==nums[low+1])low++;             //skip duplicates
                        while(low<high && nums[high]==nums[high-1])high--;           //skip duplicates
                        low++;
                        high--;}
           else if(nums[low]+nums[high]>sum){
                        high--;
                    }
                    else{
                        low++; } } }}
        return list;
    }
}
