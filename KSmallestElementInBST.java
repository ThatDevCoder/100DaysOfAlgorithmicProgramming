Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] nums = new int[2];
        inorder(root,nums,k);
        return nums[1];
        
    }
    private void inorder(TreeNode root,int[] nums,int k){
        if(root==null){
            return;
        }
        inorder(root.left,nums,k);
        if(++nums[0]==k)
        {
            nums[1] = root.val;
        }
        inorder(root.right,nums,k);
    }
}
