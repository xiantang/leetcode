#最弱解
class Solution:
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s)==0:
            return -1
        if len(s)==1:
            return 0
        repeat=set()
        for i in range(len(s)-1):
            count=0
            for j in  range(i+1,len(s)):
                if s[i]==s[j] and s[i] not  in repeat:
                    repeat.add(s[i])
                    break
                elif s[i]!=s[j] and s[i] not in  repeat:
                    count+=1

                else:
                    break
            if count == len(s) - i - 1:
                return i
        if s[len(s)-1] not in repeat:
            return len(s)-1
        return -1


print(Solution().firstUniqChar(""))