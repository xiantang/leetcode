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
            # 如果遇到[就将前面的字符串放入栈中 重置当前的数目和字符串
            if c == '[':
                stack.append(cur_string)
                stack.append(cur_num)
                cur_num = 0
                cur_string = ''
            # 如果遇到]就将前面的字符串和倍数拿出啦
            elif c == ']':
                num = stack.pop()
                pre_string = stack.pop()
                cur_string = pre_string + num * cur_string
            # 注意10位数以上的整数
            elif c.isdigit():
                cur_num = 10 * cur_num + int(c)
            else:
                cur_string += c
        return cur_string
if __name__ == '__main__':
    print(Solution().decodeString("100[leetcode]"))