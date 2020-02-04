/*
Share
Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        Arrays.sort(intervals,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        List<int[]> res = new ArrayList<>();
        int[] curr = intervals[0];
        res.add(curr);
        
        for(int[] interval:intervals){
            int curr_start = curr[0];
            int curr_end = curr[1];
            int next_start = interval[0];
            int next_end = interval[1];
            if(curr_end>=next_start)
                curr[1]=Math.max(curr_end,next_end);
            else{
                curr = interval;
                res.add(curr);
            }
            
                                
           
        }
        return res.toArray(new int[res.size()][]); 
    }
}
