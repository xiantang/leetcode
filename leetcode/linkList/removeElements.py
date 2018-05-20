# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        if head==None:
            return head
        if head.val==val and head.next==None:
            return []
        if head.next==None:
            return head
        start=head
        while head:
            if head.val==val:
                head=head.next
                start=head
            elif(head.next and head.next.val==val):
                head.next=head.next.next
            else:
                 head=head.next
        self.for__(start)

    def for__(self, head):
            while head:
                print(head.val)
                head = head.next
a=ListNode(1)

b=ListNode(2)
a.next=b


Solution().removeElements(a,1)