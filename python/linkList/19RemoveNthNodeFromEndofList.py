# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head, n):
        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
        # 定义快指针慢指针
        fast = slow = head
        # 让快指针向前走n步
        for _ in range(n):
            fast = fast.next
        # 如果快指针已经到底部的话 就直接返回就行了
        if not fast:
            return head.next
        # 当快指针到达底部的时候，慢指针正好在需要删除节点的前面
        while fast.next:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return head