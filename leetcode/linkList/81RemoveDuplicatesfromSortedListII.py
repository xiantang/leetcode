# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        null_head = ListNode(None)
        null_head.next = head
        low = head
        fast = head
        pre = null_head
        if not fast or not fast.next:
            return null_head.next
        while fast.next:
            if fast.next.val == fast.val:
                while fast:
                    if fast.next.val == fast.val:
                        fast=fast.next
                    else:
                        fast= fast.next
                        break
                pre.next = fast
            else:
                pre = fast
                fast = fast.next
        return null_head.next