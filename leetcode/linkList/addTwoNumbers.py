# Definition for singly-linked list.

############放弃####################
#                                 #
###########等待二刷##################
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

    def __str__(self):
        return self.val

class Solution:
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        new_l1=self.reverseList(l1)
        new_l2=self.reverseList(l2)

        p1=new_l1
        p2=new_l2
        add_list=ListNode(None)
        head=add_list
        carry=0
        next_link=None
        while p1 and p2:
            sum=p1.val+p2.val+carry
            if sum>=10:
                add_list.val=sum%10
                if p1.next and p2.next==None:
                    carry=1
                    next_link=p1.next
                elif p2.next and p1.next==None:
                    carry=1
                    next_link=p2.next
                elif p1.next and p2.next:
                    carry=1
                    add_list.next = ListNode(None)
                    add_list = add_list.next
                else:
                    add_list.next=ListNode(1)
                    add_list=add_list.next
            else:
                add_list.val=sum
                if p1.next and p2.next==None:
                    add_list.next=p1.next
                    add_list=p1.next

                elif p2.next and p1.next == None:
                    add_list.next = p2.next
                    add_list = p2.next
                elif p2.next==None and p1.next==None:
                    pass
                else:
                    add_list.next = ListNode(None)
                    add_list = add_list.next

            p1=p1.next
            p2=p2.next
        a=next_link
        while next_link:
            sum = next_link.val + carry
            if sum >= 10:
                next_link.val = sum % 10
                carry = 1
                if next_link.next == None:
                    next_link.next = ListNode(0)
            else:
                next_link.val=sum
                carry = 0
                next_link.val = sum
            next_link=next_link.next
        if next_link:
            add_list.next = a
        else:
            pass

        self.for__(self.reverseList(head))
    def for__(self,head):
        while head:
            print(head.val)
            head=head.next
            




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
if __name__ == '__main__':
    a=ListNode(1)





    a1 = ListNode(9)
    a2=ListNode(9)
    a1.next=a2


    heda=Solution().addTwoNumbers(a,a1)
