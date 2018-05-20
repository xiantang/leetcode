class Solution:
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle =='':
            return 0
        if needle in haystack:
            for i in range(len(haystack)):
                if needle[0]==haystack[i]:
                    count=0
                    for j in range(1,len(needle)):
                        if haystack[i+j]!=needle[j]:
                            break
                        else:
                            count+=1
                    if count==len(needle)-1:
                        return i

        else:
            return -1
print(Solution().strStr('aaaaa',''))