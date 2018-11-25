
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: list[int]
        :rtype: TreeNode
        """
        if len(nums)==0:
            return None
        elif len(nums)==1:
            return TreeNode(nums[0])
        else:
            root=TreeNode(nums[int(len(nums)/2)])
            if  len(nums[0:len(nums)/2])==0:
                root.left=None
            else:
                root.left=self.sortedArrayToBST(nums[0:int(len(nums)/2)])
            if len(nums[len(nums)/2:]==0):
                root.right=None
            else:
                root.right=self.sortedArrayToBST(nums[len(nums)/2:])
            return root



def proc(data):
    print(data)

def preleft(t,proc): #中序
    if t is None:
        return
    preleft(t.left,proc)
    proc(t.val)
    preleft(t.right,proc)
head=Solution().sortedArrayToBST([-10,-3,0,5,9])
