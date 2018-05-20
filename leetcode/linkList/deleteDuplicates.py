# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
    def __str__(self):
        return str(self.val)
class Solution:
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head==None or  head.next==None:
            return head
        start=head
        head_next=head.next
        while head_next:
            while head_next and head.val==head_next.val  :
                head.next=head_next.next
                head_next=head.next
            if head_next :
                head=head.next

                head_next=head_next.next
            else:
                break
        self.for__(start)

    def for__(self, head):
            while head:
                print(head.val)
                head = head.next

a=ListNode(1)
b=ListNode(1)
c=ListNode(2)

a.next=b
b.next=c

Solution().deleteDuplicates(a)