class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def isPalindrome(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        if head == None:
            return True
        fast = head
        slow = head
        pre = None
        #首先使用快慢指针法，使用慢指针将前面半条节点逆置
        while fast and fast.next:
            fast = fast.next.next
            temp = slow.next
            slow.next = pre
            pre = slow
            slow = temp
        #整理边界条件
        if fast:
            point1 = pre
            point2 = slow.next
        else:
            point1 =pre
            point2 = slow
        #遍历两条链表判断是否相同
        while point1 and point2:
            if point1.val != point2.val:
                return False
            point1 = point1.next
            point2 = point2.next

        return True
if __name__ == '__main__':
    A= ListNode(1)
    B = ListNode(2)
    C = ListNode(3)
    G = ListNode(3)
    D = ListNode(2)
    E = ListNode(1)
    A.next = B
    B.next =C
    C.next =G
    G.next = D
    D.next =E
    print(Solution().isPalindrome(A))
