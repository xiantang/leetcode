# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
    def __str__(self):
        return  str(self.val)
class Solution(object):
    result = []


    def binaryTreePaths(self, root):
            # Write your code here
        path = ''
        res = []
        self.TreePathsHelper(root, path, res)
        return res

    def TreePathsHelper(self, root, path, res):
        if root==None:
            return #给头是空设计的
        path+=str(root.val)
        if root.left:
            self.TreePathsHelper(root.left,path+"->",res)
        if root.right:
            self.TreePathsHelper(root.right,path+"->",res)
        if root.right is None and root.left is None:
            res.append(path)


if __name__ == '__main__':
    a = TreeNode(1)
    b = TreeNode(2)
    c = TreeNode(2)
    d=TreeNode(3)
    e=TreeNode(5)
    h=TreeNode(4)
    g = TreeNode(7)
    a.left = b
    a.right = c
    c.left=d
    b.left=e
    b.right=h
    e.left=g

    print(Solution().binaryTreePaths(a))