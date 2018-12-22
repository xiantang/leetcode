class Solution:
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """

        s = s.lower()
        string = []
        for c in s:
            if c.isalnum():
                string.append(c)
        if len(string)==0:
            return True
        size = len(string) - 1
        for i in range(int(size / 2) + 1):
            if string[i] == string[len(string) - 1 - i]:
                pass
            else:
                return False
        return True

print(Solution().isPalindrome(''))