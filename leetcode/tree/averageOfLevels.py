# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def averageOfLevels(self, root):
        """
        :type root: TreeNode
        :rtype: List[float]
        """
        if root==None:
            return  []
        else:
            result=[]
            father_node=[root]
            father_val=root.val
            result.append(father_val)
        while len(father_node)>0:
            child_node=[]
            child_sum=0
            count=0.0
            for x in father_node:
                if x.left!=None:
                    child_node.append(x.left)
                    child_sum+=x.left.val
                    count+=1
                if x.right!=None:
                    child_node.append(x.right)
                    child_sum += x.right.val
                    count += 1
            father_node=child_node
            if len(child_node)!=0:
                result.append(child_sum/count)
        return result
if __name__ == '__main__':
    a = TreeNode(3)
    b = TreeNode(9)
    c = TreeNode(20)
    d = TreeNode(15)
    e = TreeNode(7)

    a.left = b
    a.right = c
    c.left=d
    c.right=e
    print(Solution().averageOfLevels(a))