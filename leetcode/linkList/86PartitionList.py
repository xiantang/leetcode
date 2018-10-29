# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def partition(self, head, x):
        """
        :type head: ListNode
        :type x: int
        :rtype: ListNode
        """
        h1  = l1 = ListNode(0)
        h2 = l2 = ListNode(0)
        while head:
            if head.val<x:
                l1.next = head
                l1 = l1.next
            else:
                l2.next = head
                l2 = l2.next
            head = head.next
        l2.next=None
        l1.next = h2.next
        return h1.next




if __name__ == '__main__':

    a = ListNode(1)
    b = ListNode(2)
    c = ListNode(5)
    d = ListNode(4)
    e = ListNode(2)
    f = ListNode(1)
    g = ListNode(7)
    a.next = b
    b.next = c
    c.next = d
    d.next = e
    e.next = f
    f.next = g
    Q=reverse(a)
    Solution().partition(a,3)
