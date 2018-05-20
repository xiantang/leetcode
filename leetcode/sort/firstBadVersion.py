# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        min=1
        max=n
        mid=0
        while min<=max:
            mid=min+(max - min )/2
            if isBadVersion(mid):
                max=mid-1
            else:
                min=mid+1
        return min


Solution().firstBadVersion(100)