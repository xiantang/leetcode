class Solution(object):
    def isValidSerialization(self, preorder):
        """
        :type preorder: str
        :rtype: bool
        """
        stack = []
        for c in preorder.split(','):
            if c == "#":
                while len(stack) >= 2 and stack[-1] == '#' and stack[-2] != '#':
                    stack.pop()
                    stack.pop()
            stack.append(c)
        return stack == ['#']
