import collections
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        d = collections.deque()
        for char in s:
            if char == ")":
                if not d:
                    return False
                pre_char=d.pop()
                if pre_char == '(':
                    pass
                else:
                    return False
            elif char == "]":
                if not d:
                    return False
                pre_char = d.pop()
                if pre_char == '[':
                    pass
                else:
                    return False
            elif char == "}":
                if not d:
                    return False
                pre_char = d.pop()
                if pre_char == '{':
                    pass
                else:
                    return False
            else:
                d.append(char)
        if d:
            return False
        else:return True