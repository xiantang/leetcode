class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        如果当前节点的下一个节点和当前节点值相等
        就遍历当前节点之后的节点
        找到最后一个相等的节点
        取出这个节点的下一个节点
        """
        h = head

        while head and head.next:
            if head.val == head.next.val:
                temp = head
                if temp.next == None:
                    temp = None
                    head.next = temp
                    break
                while temp.next and  temp.val == temp.next.val:
                    temp = temp.next
                temp = temp.next
                head.next = temp

            else:
                head = head.next
        return h

if __name__ == '__main__':
    A= ListNode(1)
    B = ListNode(1)
    C = ListNode(1)
    D = ListNode(1)
    E = ListNode(3)
    A.next = B
    B.next =C
    C.next =E
    D= Solution().deleteDuplicates(A)
    print(1)
