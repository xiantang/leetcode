class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x>-pow(2,31) and x<pow(2,31)-1:


            x=str(x)
            if x.startswith('-'):
                x=x.replace('-','')
                a = ''
                for j in range(len(x) - 1, -1, -1):
                    a += x[j]
                a=int(a)
                a=-a
                if a>-pow(2,31) and a<pow(2,31)-1:
                    return  a
                else:return 0
            else:
                a = ''
                for j in range(len(x) - 1, -1, -1):
                    a += x[j]
                a=int(a)
                if a>-pow(2,31) and a<pow(2,31)-1:
                    return  a
                else:return 0
        else:
            return 0

print(Solution().reverse(1534236469))