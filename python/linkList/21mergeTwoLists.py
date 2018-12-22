# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):


    def mergeTwoLists(self, l1, l2):
        """

        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        使用同时遍历l1,l2 如果l1>l2就将他l2加入新的链表，
        l2和新链表都同时向后移动1位,反则同样,如果同就将l1
        加入新的链表l1和新链表都同时向后移动1位,如果某一条链表为空
        将另一条链表的头节点加入新的链表
        """
        l3 = ListNode(0)
        ll = l3
        if l1 == None:
            return l2
        if l2 == None:
            return l1
        while l1 != None or l2 != None:
            if not l1:
                l3.next = l2
                break
            if not l2:
                l3.next = l1
                break
            if l1.val > l2.val:
                new_node = ListNode(l2.val)
                l3.next = new_node
                l3 = l3.next
                l2 = l2.next
            elif l2.val > l1.val:
                new_node = ListNode(l1.val)
                l3.next = new_node
                l3 = l3.next
                l1 = l1.next
            else:
                new_node = ListNode(l1.val)
                l3.next = new_node
                l3 = l3.next
                l1 = l1.next
        return ll.next