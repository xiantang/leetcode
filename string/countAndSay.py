class Solution:
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        num="1"
        for i in range(1,n):
            num=self.next(num)
        return num
    def next(self,num):
        prev=num[0]
        count=1
        result=""
        for i in range(1,len(num)):
            if num[i]==prev:
                count+=1
            else:
                prev=num[i]
                result+=str(count)
                result+=num[i-1]
                count=1
        result+=str(count)
        result+=num[-1]
        return result
print(Solution().countAndSay(5))