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
        """
        curA = headA
        curB = headB

        if not headA or not headB:
            return None
        #同时遍历两个链表  循环条件是 是否相同
        while curA or curB:
            if not curA:
                curA = headB
            #如果一个链表到尾节点的 就从指向另外一个链表 这样只要遍历len(A)+len(B)长度就能够得出了
            if not curB:
                curB = headA

            if curA == curB:
                return curA
            curA = curA.next
            curB = curB.next

        return None
a=ListNode(1)
b=ListNode(2)
c=ListNode(2)

a.next=b
b.next=c

a1=ListNode(1)
a1.next=b
print(Solution().getIntersectionNode(a,a1).val)