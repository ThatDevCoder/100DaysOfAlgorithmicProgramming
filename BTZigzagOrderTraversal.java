/*
Share
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
*/
//Code:
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
       if (root==null) return result;
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);
        int count=0;
       while(!queue.isEmpty())
       {
            int size = queue.size();
            List<Integer> curr = new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode current = queue.remove();
                curr.add(current.val);
                if(current.left != null)
                    queue.add(current.left);
                if(current.right != null)
                    queue.add(current.right);
                
            }
           if(count%2==0)
            result.add(curr);
           else
           {    List<Integer> temp = new LinkedList<>();
           
               for(int i=curr.size()-1;i>=0;i--){
                   temp.add(curr.get(i));
               }
               result.add(temp);
           }
           count++;
        }
        return result;
        
    }
}
