class ListNode(object):
    def __init__(self,data):
        self.data=data
        self.pnext=None

    def __repr__(self):
        return str(self.data)

class LinkedList:

    def __init__(self):
        self.length=0
        self.head=None
    def is_empty(self):
        return  self.length==0

    def append(self,this_node):
        if isinstance(this_node, ListNode):
            pass
        else:
            this_node=ListNode(data=this_node)
        if self.is_empty():
            self.head=this_node
        else:
            node=self.head
            while node.pnext:
                node=node.pnext
            node.pnext=this_node
        self.length+=1


    def print_linked_list(self):
        """
        对整个链表的打印
        :return: None
        """
        if self.is_empty():
            print("Linked list's length is 0")
        else:
            node = self.head
            print("Head -->", node.data, end=' ')
            while node.pnext:
                node = node.pnext
                print("-->", node.data, end=' ')
            print("--> None. Linked node finished")


node1 = ListNode(data='node1')
node2 = ListNode(data='node2')
linked_list = LinkedList()
linked_list.append(node1)
linked_list.append(node2)
linked_list.print_linked_list()