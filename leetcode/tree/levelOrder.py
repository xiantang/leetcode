from queue import Queue
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
        res = []
        if root == None:
            return res
        res.append([root.val])
        queue = Queue()
        father_node = []
        queue.put(root)

        father_node.append(root)
        while len(father_node)!=0:
            child_node = []
            child_val = []

            for node in father_node:
                if node.left is not None:
                    child_node.append(node.left)
                    child_val.append(node.left.val)
                    queue.put(node.left)
                if node.right is not None:
                    child_node.append(node.right)
                    child_val.append(node.right.val)
                    queue.put(node.right)
            if child_node == []:
                pass
            else:
                res.append(child_val)
            father_node = child_node
        return res







if __name__ == '__main__':
    a = TreeNode(1)
    b = TreeNode(2)
    c = TreeNode(2)
    d = TreeNode(3)
    e = TreeNode(4)
    f = TreeNode(4)
    g = TreeNode(3)
    a.left = b
    a.right = c
    c.left = f
    c.right = g
    b.left = d
    b.right = e
    print(Solution().levelOrder(a))