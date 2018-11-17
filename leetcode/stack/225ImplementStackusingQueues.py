import collections


class MyStack(object):

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.queue = collections.deque()

    def push(self, x):
        """
        Push element x onto stack.
        :type x: int
        :rtype: void
        """
        self.queue.append(x)

    def pop(self):
        """
        Removes the element on top of the stack and returns that element.
        :rtype: int
        """
        # 新建一个队列
        sub_queue = collections.deque()
        while len(self.queue) != 1:
            sub_queue.append(self.queue.popleft())
        value = self.queue.popleft()
        self.queue = sub_queue
        return value

    def top(self):
        """
        Get the top element.
        :rtype: int
        """
        sub_queue = collections.deque()
        while len(self.queue) != 1:
            sub_queue.append(self.queue.popleft())
        value = self.queue.popleft()
        sub_queue.append(value)
        self.queue = sub_queue
        return value

    def empty(self):
        """
        Returns whether the stack is empty.
        :rtype: bool
        """
        return len(self.queue) == 0
obj = MyStack()
obj.push(1)
obj.push(2)
param_3 = obj.top()
print(param_3)
param_2 = obj.pop()
print(param_2)

param_4 = obj.empty()