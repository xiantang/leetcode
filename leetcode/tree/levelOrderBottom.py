class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
class Solution(object):
    def levelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: list[list[int]]

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
            return  list(reversed(result))



if __name__ == '__main__':
    a = TreeNode(1)
    b = TreeNode(2)
    c = TreeNode(2)
    d = TreeNode(3)
    e = TreeNode(4)
    f = TreeNode(4)
    g = TreeNode(2)
    a.left = b
    a.right = c
    c.left = f
    c.right = g
    b.left = d
    b.right = e
    print(Solution().levelOrder(a))