# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):

    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root==None:
            return      True
        return self.vaild(root.left,root.right)

    def vaild(self,p,q):
        if p==None and q==None:
            return True
        if p==None or q==None:
            return False
        return q.val==p.val and self.vaild(p.left,q.right) and self.vaild(p.right,q.left)


if __name__ == '__main__':

    a=TreeNode(1)
    b=TreeNode(2)
    c=TreeNode(2)
    d=TreeNode(3)
    e=TreeNode(4)
    f=TreeNode(4)
    g=TreeNode(3)
    a.left=b
    a.right=c
    c.left=f
    c.right=g
    b.left=d
    b.right=e
    s=Solution()
    s.isSymmetric(a)
