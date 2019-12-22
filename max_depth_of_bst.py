/*
Given a binary tree,  find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

          Example:

          Given binary tree [3,9,20,null,null,15,7],
          
                    3
                   / \
                  9  20
                    /  \
                   15   7
                   
            return its depth = 3.

*/

Solition:
Time Complexity: O(N)
Here I used python because traversing through trees in pyhton is bit easier than Java and exponentially easier than C++


Code:

 Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if root is None:
            return 0
        left = self.maxDepth(root.left)
        right = self.maxDepth(root.right)
        return max(left,right) + 1
        
