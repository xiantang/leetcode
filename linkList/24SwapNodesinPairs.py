class Solution:
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head or not head.next:
            return head
        # head_bak= head.next
        be = head
        first = head.next
        af = head.next
        pre = ListNode(None)
        while af:
            be.next = af.next
            af.next = be
            pre.next = af
            pre = be
            be = be.next
            if not be or  not be.next:
                break
            af = be.next
        return first

class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

if __name__ == '__main__':
    a = ListNode(1)
    b = ListNode(2)
    c = ListNode(3)
    d = ListNode(4)
    e = ListNode(5)
    a.next = b
    b.next = c
    c.next = d
    d.next = e

    A = Solution().swapPairs(a)