
# Definition for a Node.
class Node(object):
    def __init__(self, val, prev, next, child):
        self.val = val
        self.prev = prev
        self.next = next
        self.child = child



class Solution(object):
    def flatten(self, head):
        """
        :type head: Node
        :rtype: Node
        """
        if not head:
            return
        dummy = Node(0,None,head,None)
        stack = []
        stack.append(head)
        prev = dummy
        while stack:
            root = stack.pop()
            root.prev = prev
            prev.next = root
            if root.next:
                stack.append(root.next)
                root.next = None
            if root.child:
                stack.append(root.child)
                root.child = None
            prev = root
        dummy.next.prev = None
        return dummy.next








a = Node(1,None,None,None)
b = Node(2,None,None,None)
c = Node(3,None,None,None)
d = Node(4,None,None,None)
e = Node(5,None,None,None)
a.next = b
b.next = c
b.child=d
d.next= e
A=Solution().flatten(a)
print(1)
