class Solution(object):
    def minCostClimbingStairs(self, cost):
        """
        :type cost: List[int]
        :rtype: int
        """
        # 使用step表示需要走到n台阶的成本
        length = len(cost)+1
        step = [0]*length
        #step[i] = min(step[i-1]+cost[i-1],step[i-2]+cost[i-2])
        step[0] = 0
        step[1] = 0
        for i in range(2,length):
            step[i] = min(step[i-1]+cost[i-1],step[i-2]+cost[i-2])
        return step[length-1]
if __name__ == '__main__':
    print(Solution().minCostClimbingStairs([1, 100, 1, 1, 1, 100, 1, 1, 100, 1]))