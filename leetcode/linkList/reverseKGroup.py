# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
    def __str__(self):
        return str(self.val)

class Solution:
    def reverseKGroup(self, head, k):
        """
        :type head: ListNode
        :type k: int
        :rtype: ListNode
        """
        
    def for__(self,head):
        while head:
            print(head.val)
            head=head.next
a=ListNode(1)
b=ListNode(2)
c=ListNode(3)
d=ListNode(4)
e=ListNode(5)
a.next=b
b.next=c
c.next=d
d.next=e
head=Solution().reverseKGroup(a,3)
Solution().for__(head)