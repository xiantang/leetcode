# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
    def __str__(self):
        return str(self.val)

class Solution:
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head==None or head.next==None:
            return  head
        new=ListNode(0)
        new.next=head
        head=new

        while head.next is not  None and head.next.next is not None:
            n1=head.next
            n2=head.next.next
            head.next=n2
            n1.next=n2.next
            n2.next=n1
            head=n1
        return new.next

        while head:
            print(head.val)
            head=head.next
if __name__ == '__main__':
    a=ListNode(1)
    b=ListNode(2)
    c = ListNode(3)
    d = ListNode(4)
    e = ListNode(5)
    f=ListNode(6)
    g=ListNode(7)
    t=ListNode(8)
    a.next=b
    b.next=c
    c.next=d
    d.next=e
    e.next=f
    f.next=g
    g.next=t
    Solution().swapPairs(a)
