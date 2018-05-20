# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

# class Solution(object):
#     def getIntersectionNode(self, headA, headB):
#         """
#         :type head1, head1: ListNode
#         :rtype: ListNode
#         超出时间限制
#         """
#         start=headB
#         while headA:
#             while headB:
#                 if headA==headB:
#                     return headB
#                 headB=headB.next
#
#             headA=headA.next
#             headB=start
#         return None

class Solution(object):
    def getIntersectionNode(self, headA, headB):
        """
        :type head1, head1: ListNode
        :rtype: ListNode
        超出时间限制
        """
        s1 = 0
        s2 = 0
        h1 = headA
        h2 = headB
        while h1 is not None:
            s1 += 1
            h1 = h1.next
        while h2 is not None:
            s2 += 1
            h2 = h2.next
        if s2 > s1:
            h2 = headB
            while s2 - s1 > 0:
                h2 = h2.next
                s2 -= 1
            h1 = headA
        elif s2 < s1:
            h1 = headA
            while s1 - s2 > 0:
                h1 = h1.next
                s1 -= 1
            h2 = headB
        else:
            h1 = headA
            h2 = headB
        res = None
        while h1 is not None and h2 is not None:
            if h1 == h2:
                res = h1
                return h1
            h1 = h1.next
            h2 = h2.next
        return res
a=ListNode(1)
b=ListNode(2)
c=ListNode(2)

a.next=b
b.next=c

a1=ListNode(1)
a1.next=b
print(Solution().getIntersectionNode(a,a1).val)