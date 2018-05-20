class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head==None or head.next==None:
            return head
        p=head
        new_H=None
        while p!=None:
            temp=p.next #暂存
            p.next=new_H
            new_H=p
            p=temp
        return new_H

    def for__(self,head):
        while head:
            print(head.val)
            head=head.next


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
    heda=Solution().reverseList(a)
    Solution().for__(heda)
