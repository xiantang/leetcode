class Solution(object):
    def middleNode(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        定义两个指针一快一慢
        快走两步慢走一步
        循环条件快的不存在或者快的下一个不存在的时候中断
        返回慢的
        """
        low = head
        fast = head
        while fast!=None and fast.next != None:
            low = low.next
            fast = fast.next.next
        return low