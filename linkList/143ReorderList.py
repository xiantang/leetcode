# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def reorderList(self, head):
        """
        :type head: ListNode
        :rtype: void Do not return anything, modify head in-place instead.
        """
        fast=head.next
        slow=head
        while fast and fast.next:
            fast=fast.next.next
            slow=slow.next
        cur=slow.next
        slow.next=None
        while cur:
            temp=cur
            cur=cur.next
            temp.next=slow.next
            slow.next=temp
        
