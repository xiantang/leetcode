# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        slow,fast,new_head=head,head,None

        while fast and fast.next:
            fast=fast.next
            next_node=slow.next
            slow.next=new_head
            new_head=slow
            slow=next_node

        if fast:
            slow=slow.next
        while new_head and new_head.val==slow.val:
            new_head,slow=new_head.next,slow.next
        return not new_head



if __name__ == '__main__':

    a=ListNode(1)
    b=ListNode(2)
    c=ListNode(3)
    d=ListNode(4)
    e=ListNode(5)
    f=ListNode(6)
    a.next=b
    b.next=c
    c.next=d
    d.next=e
    e.next=f
    Solution().isPalindrome(a)