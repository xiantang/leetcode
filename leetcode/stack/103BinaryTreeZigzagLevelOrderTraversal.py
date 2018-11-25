import collections
class Solution(object):
    def zigzagLevelOrder(self, root):
        """
        :type root: T
        reeNode
        :rtype: list[list[int]]
        """
        stack = []

        stack.append(root)
        res = []
        tem = []
        flag = 1
        while stack:
            for i in range(len(stack)):
                node = stack.pop(0)
                tem.append(node.val)

                if node.left:
                    stack.append(node.left)
                elif node.right:
                    stack.append(node.right)
            res.append(tem[::flag])
            flag = -flag
            tem = []
        return res