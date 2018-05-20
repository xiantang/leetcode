# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def isValidBST(self, root):
        """
        给定一个二叉树，判断其是否是一个有效的二叉搜索树。
        一个二叉搜索树具有如下特征：
        节点的左子树只包含小于当前节点的数。
        节点的右子树只包含大于当前节点的数。
        所有左子树和右子树自身必须也是二叉搜索树。

        :type root: TreeNode
        :rtype: bool
        """
        return  self.validBST(root,-21474836480, 21474836470)

    def validBST(self,root,min,max):
        if root==None:
            return True
        if root.val<=min or root.val>=max:
            return False
        return self.validBST(root.left,min,root.val) and self.validBST(root.right,root.val,max)
if __name__ == '__main__':
    a=TreeNode(3)
    b=TreeNode(1)
    c=TreeNode(4)
    a.left=b
    a.right=c
    Solution().isValidBST(a)