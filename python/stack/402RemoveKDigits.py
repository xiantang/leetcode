class Solution(object):
    def removeKdigits(self, num, k):
        """
        :type num: str
        :type k: int
        :rtype: str
        """
        if len(num) <= k:
            return '0'
        stack = []
        for c in num:
            while stack and k > 0 and int(stack[-1]) > int(c):
                stack.pop()
                k -= 1
            stack.append(c)
        while k > 0:  # corner case 112 remove 1
            stack.pop()
            k -= 1
        return ''.join(stack).lstrip('0') or '0'
