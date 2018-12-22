class Solution:
    def maxDistToClosest(self, seats):
        """
        :type seats: List[int]
        :rtype: int
        """

        first = 0
        tail = 0
        i = 0
        while seats[i] == 0:
            i += 1
            first += 1
        j = len(seats) - 1
        while seats[j] == 0:
            j -= 1
            tail += 1
        max_between = 0
        temp = 0
        for i in range(i, j + 1):
            if seats[i] == 0:
                temp += 1
            else:
                if temp > max_between:
                    max_between = temp
                temp = 0

        return max(first, tail, (max_between + 1) // 2)




