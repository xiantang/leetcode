# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

#Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def sortedListToBST(self, head):
        """
        :type head: ListNode
        :rtype: TreeNode
        """
        if not head:
            return None
        if not head.next:
            return TreeNode(head.val)
        low = head
        fast = head.next.next
        # 找到中间点
        while fast and fast.next:
            low = low.next
            fast = fast.next.next

        temp = low.next  # 切断链表
        low.next = None
        # 将当前的中点作为root
        root = TreeNode(temp.val)
        #分别构造左右节点
        root.left = self.sortedListToBST(head)
        root.right = self.sortedListToBST(temp.next)
        return root