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
        ### 时间复杂度 O(1)

        if not head or not head.next:
            return head
            # 记录头节点
        first = head
        # 定义奇偶链表
        odd = head
        even = head.next
        # 记录偶链表的头部
        even_head = head.next
        while even and even.next:
            # 未处理的奇数节点永远在偶数节点之后 反之同样
            # 将其链接
            odd.next = even.next
            temp = even.next  # 记录奇数链表的尾部
            even.next = odd.next.next
            # 将奇数链表的尾部和偶数链表的头部链接
            temp.next = even_head
            # 奇偶链表各走一步
            even = even.next
            odd = odd.next
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