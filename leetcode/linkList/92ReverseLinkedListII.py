class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def reverseBetween(self, head, m, n):
        """
        :type head: ListNode
        :type m: int
        :type n: int
        :rtype: ListNode
        """
        # 定义头节点
        pre = ListNode(None)
        pre.next = head
        slow = pre
        # 找到目标节点的前一个节点
        for _ in range(m - 1):
            slow = slow.next
        # 将[m - n] 区间的链表逆置
        sh = slow.next
        s = slow.next
        f = s.next
        for _ in range(n - m):
            t = f.next
            f.next = s
            s = f
            f = t
        # 连接链表
        sh.next = f
        slow.next = s
        return pre.next