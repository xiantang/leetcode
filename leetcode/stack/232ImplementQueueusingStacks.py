import collections
class MyQueue(object):
    def __init__(self):
        self.stack = collections.deque()

    def push(self, x):
        self.stack.append(x)

    def pop(self):
        sub_stack = collections.deque()
        while len(self.stack)!=1:
            sub_stack.append(self.stack.pop())
        value = self.stack.pop()
        while sub_stack:
            self.stack.append(sub_stack.pop())
        return value

    def peek(self):
        sub_stack = collections.deque()
        while len(self.stack)!=1:
            sub_stack.append(self.stack.pop())
        value = self.stack.pop()
        self.stack.append(value)
        while sub_stack:
            self.stack.append(sub_stack.pop())

        return value
    def size(self):
        return len(self.stack)

    def is_empty(self):
        return self.size() == 0
if __name__ == '__main__':
    queue = MyQueue()
    queue.push(1)
    queue.push(2)
    print(queue.peek())
