# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def oddEvenList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """

        odd_list = ListNode(None)
        first = odd_list

        even_list = ListNode(None)
        second = even_list
        while head:
            temp = head.next
            head.next = None
            if head.val % 2 == 1:

                odd_list.next = head
                odd_list = odd_list.next
            else:

                even_list.next = head
                even_list = even_list.next
            head = temp
        odd_list.next = second.next
        first = first.next
        return first
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
    A = Solution().oddEvenList(a)