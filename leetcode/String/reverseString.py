class Solution:
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        a=''
        for j in range(len(s)-1,-1,-1):
            a+=s[j]
        return a