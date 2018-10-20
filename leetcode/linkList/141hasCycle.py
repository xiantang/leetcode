# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        使用快慢指针法 遍历整个链表 如果fast和li相等 就返回True
        """
        fast =head
        lo = head
        while fast and fast.next:
            fast = fast.next.next
            lo = lo.next
            if lo == fast:
                return True
        return False

if __name__ == '__main__':
    s = Solution()
    A = ListNode(3)
    B = ListNode(2)
    C = ListNode(0)
    D = ListNode(-4)

    A.next =B
    B.next = C
    C.next =D
    D.next=B

    print(s.hasCycle(A))