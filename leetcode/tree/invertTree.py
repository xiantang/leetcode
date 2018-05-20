# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
    def __str__(self):
        return  str(self.val)
class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if root is None:
            return
        root.left,root.right=root.right,root.left
        root.left=self.invertTree(root.left)
        root.right=self.invertTree(root.right)
        return root


    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]

        """
        if root == None:
            return []
        else:
            result = []

            father_node = [root]
            father_val = [root.val]

            result.append(father_val)

            while len(father_node) > 0:
                child_node=[]
                child_val=[]
                for x in father_node:
                    if x.left!=None:
                        child_node.append(x.left)
                        child_val.append(x.left.val)
                    if x.right!=None:
                        child_node.append(x.right)
                        child_val.append(x.right.val)
                father_node=child_node
                if len(child_node)!=0:
                    result.append(child_val)
            return  result

if __name__ == '__main__':
    a = TreeNode(1)
    b = TreeNode(3)
    c = TreeNode(2)
    d = TreeNode(3)
    e = TreeNode(4)
    f = TreeNode(6)
    g = TreeNode(5)
    a.left = b
    a.right = c
    c.left = f
    c.right = g
    b.left = d
    b.right = e
    a=Solution().invertTree(a)
    print(Solution().levelOrder(a))