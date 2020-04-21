/*
Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)

 

Example 1:

Input: [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]

*/
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
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,0,preorder.length);
    }
    private TreeNode helper(int[] preorder , int rootIndex , int right){
        if(rootIndex>=right)
            return null;
        int value = preorder[rootIndex];
        TreeNode root = new TreeNode(value);
        
        int i = rootIndex+1;
        while(i<=right-1 && preorder[i]<=value){
            i++;
        }
        root.left = helper(preorder,rootIndex+1,i);
        root.right = helper(preorder,i,right);
        return root;
    }
}
