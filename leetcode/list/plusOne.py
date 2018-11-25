class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        x=''
        # x=int(''.join(digits))
        for i in digits:
           x=x+str(i)
        x=int(x)+1
        lis=[]
        for i in str(x):
            lis.append(int(i))
        return lis

print(Solution().plusOne([4,3,2,1]))