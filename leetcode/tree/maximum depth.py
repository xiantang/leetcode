# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root==None:
            return 0
        else:
            left=1
            right=1
            left=left+self.maxDepth(root.left)
            right=right+self.maxDepth(root.right)
            return  max(left,right)

