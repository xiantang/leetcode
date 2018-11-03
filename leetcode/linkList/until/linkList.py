# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
class Solution(object):
    def sortedListToBST(self, head):
        """
        :type head: ListNode
        :rtype: TreeNode
        """

        nums = []
        if head == None:
            return None
        while head and head.next:
            nums.append(head.val)
            head = head.next
        nums.append(head.val)
        return self.sortedArrayToBST(nums)
        

    def sortedArrayToBST(self, nums):
        if len(nums) == 1:
            return TreeNode(nums[0])
        elif len(nums) == 0:
            return None
        else:
            root = TreeNode(nums[len(nums) / 2])
            if len(nums[0:len(nums) / 2]) == 0:
                root.left = None
            else:
                root.left = self.sortedArrayToBST(nums[0:len(nums) / 2])
            if len(nums[len(nums) / 2 + 1:]) == 0:
                root.right = None
            else:
                root.right = self.sortedArrayToBST(nums[len(nums) / 2 + 1:])
            return root