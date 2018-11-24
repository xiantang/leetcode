import collections

class Solution(object):
    def decodeString(self, s):
        """
        :type s: str
        :rtype: str
        """
        stack = []
        cur_num = 0
        cur_string = ''
        for c in s:
            if c == '[':
                stack.append(cur_string)
                stack.append(cur_num)
                cur_num = 0
                cur_string = ''
            elif c == ']':
                num = stack.pop()
                pre_string = stack.pop()
                cur_string = pre_string + num * cur_string
            elif c.isdigit():
                cur_num = 10 * cur_num + int(c)
            else:
                cur_string += c
        return cur_string
if __name__ == '__main__':
    print(Solution().decodeString("100[leetcode]"))