/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.


The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

Example:

Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
*/

class Solution {
    public int trap(int[] height) {
        if(height.length==0 || height==null) return 0;
        int leftMax[] = new int[height.length];
        int rightMax[] = new int[height.length];
        int leftMaxHeight = height[0];
        for(int i=0;i<height.length;i++){
            leftMaxHeight = Math.max(height[i],leftMaxHeight);
            leftMax[i] = leftMaxHeight;
        }
        int rigthMaxHeight = height[height.length-1];
        for(int i=height.length-1;i>=0;i--){
            rigthMaxHeight = Math.max(height[i],rigthMaxHeight);
            rightMax[i] = rigthMaxHeight;
        }
        int total=0;
        for(int i=0;i<height.length;i++){
            int m = Math.min(leftMax[i],rightMax[i]);
            total += m - height[i];
        }
        return total;
    }
}
