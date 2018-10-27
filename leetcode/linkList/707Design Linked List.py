class ListNode:
    def __init__(self, val=None, next=None):
        self.val = val
        self.next = next


class MyLinkedList(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.head = None
        self.tail = None
        self.size = 0

    def get(self, index):
        """
        Get the value of the index-th node in the linked list. If the index is invalid, return -1.
        :type index: int
        :rtype: int
        """
        head = self.head
        for i in range(index):
            if head:
                head = head.next
            else:
                break
        return head.val if head else -1

    def addAtHead(self, val):
        """
        Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
        :type val: int
        :rtype: void
        """
        if not self.head:
            self.head = ListNode(val, None)
            self.tail = self.head
        else:
            temp = self.head
            self.head = ListNode(val, temp)
        self.size+=1  #长度+1

    def addAtTail(self, val):
        """
        Append a node of value val to the last element of the linked list.
        :type val: int
        :rtype: void
        """
        if not self.head:
            self.head = ListNode(val, None)
            self.tail = self.head
        #         head = self.head
        #         while head.next:

        #             head = head.next
        self.tail.next = ListNode(val, None)
        self.tail = self.tail.next
        self.size += 1

    def addAtIndex(self, index, val):
        """
        Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
        :type index: int
        :type val: int
        :rtype: void
        """
        if index == 0:
            self.addAtHead(val)
            self.size += 1
        elif index == self.size:
            self.tail.next = ListNode(val,None)
            self.tail = self.tail.next
            self.size += 1
        else:
            head = self.head
            if head:
                for i in range(index - 1):
                    if head.next:
                        head = head.next
                    else:
                        return
                temp = ListNode(val=val, next=head.next)
                head.next = temp
                self.size += 1

    def deleteAtIndex(self, index):
        """
        Delete the index-th node in the linked list, if the index is valid.
        :type index: int
        :rtype: void
        """
        head = self.head
        if head:
            if index == 0:
                self.head = self.head.next
                self.size -= 1
            else:
                for i in range(index - 1):
                    if head.next:
                        head = head.next
                    else:
                        return
                if head.next:
                    head.next = head.next.next
                    self.size -= 1

# Your MyLinkedList object will be instantiated and called as such:
obj = MyLinkedList()
# param_1 = obj.get(index)
obj.addAtHead(7)
obj.addAtHead(2)
obj.addAtHead(1)
obj.addAtIndex(3,0)
obj.deleteAtIndex(2)
obj.addAtHead(6)
obj.addAtTail(4)
print(obj.get(4))
obj.addAtHead(4)
obj.addAtIndex(5,0)
obj.addAtHead(6)

# obj.deleteAtIndex(index)