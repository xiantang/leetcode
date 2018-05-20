# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def oddEvenList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        single=head
        odd=head.next
        while odd and odd.next  :
            s=single.next
            single.next=odd.next
            odd.next=odd.next.next
            single.next.next=s
            single=single.next
            odd=odd.next

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
    a.next=b
    b.next=c
    c.next=d
    d.next=e
    e.next=f
    f.next=g
    Solution().oddEvenList(a)