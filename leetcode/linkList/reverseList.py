class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def reverseListRecursion(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        递归做法
        从头开始遍历 存储当前节点的下一个节点 将当前节点指向之前的一个节点 不断向前递归
        """

        def _reverseList(head, prv=None):
            if head == None:
                return prv
            n = head.next
            head.next = prv
            return _reverseList(n, head)

        return _reverseList(head)
    def reverseListForLoop(self,head):
        def reverse(head):
            prv = None
            while head:
                n = head.next
                head.next = prv
                prv = head
                head = n
            return prv
        return reverse(head)

if __name__ == '__main__':
    a=ListNode(1)
    b=ListNode(2)
    c=ListNode(3)
    d=ListNode(4)
    e=ListNode(5)
    a.next=b
    b.next=c
    c.next=d
    d.next=e
    heda=Solution().reverseListForLoop(a)
    print(1)
