# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
    def __str__(self):
        return  str(self.val)
class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if not p and not q:
            return True
        if p and q and p.val==q.val:
            l=self.isSameTree(p.left,q.left)
            r=self.isSameTree(p.right,q.right)
            return l and r
        else:
            return False

if __name__ == '__main__':
    a = TreeNode(2)
    b = TreeNode(2)
    c = TreeNode(1)
    a1 = TreeNode(2)
    b1 = TreeNode(2)
    c1 = TreeNode(2)
    a.left = b
    a.right = c
    a1.left = b1
    a1.right = c1
    print(Solution().isSameTree(a,a1))