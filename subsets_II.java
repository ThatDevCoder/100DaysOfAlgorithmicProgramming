/*

Time Complexity:
    O(2^n)
    All the complexities related to recursion problem are very high we all know that.
 
Code:
*/


class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if(nums==null||nums.length==0) return result;
        backtrack(nums,result,new ArrayList<>(),0);
        return result;
        
    }
    private void backtrack(int[] nums,List<List<Integer>> result,List<Integer> current, int index){
        result.add(new ArrayList<>(current));
        for(int i = index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]) continue;
            current.add(nums[i]);
            backtrack(nums,result,current,i+1);
            current.remove(current.size()-1);
        }
    }
