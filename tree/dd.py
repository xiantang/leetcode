from queue import Queue
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
class Solution:
    def lowestCommonAncestor(self, root, p, q):
        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
        q_ancestor = []
        p_ancestor = []
        def find_ancestor(root,ancestor,num):
            if root == None:
                return
            ancestor.append(root.val)
            if root.val ==num:
                return ancestor.append(num)
            find_ancestor(root.left,ancestor,num)
            find_ancestor(root.right, ancestor, num)
            print(ancestor.pop())
        find_ancestor(root,q_ancestor,p)
        print(q_ancestor)
if __name__ == '__main__':
    z = TreeNode(88)

    a = TreeNode(1)
    b = TreeNode(2)
    ee = TreeNode(6)
    c = TreeNode(2)
    b.left =ee
    d=TreeNode(3)
    e=TreeNode(5)
    h=TreeNode(4)
    dd = TreeNode(10)
    g = TreeNode(7)
    a.left = b
    z.left=a
    a.right = c
    c.left=d
    ee.left=e
    ee.right=h
    e.left=g
    h.left = dd
    Solution().lowestCommonAncestor(z,4,5)