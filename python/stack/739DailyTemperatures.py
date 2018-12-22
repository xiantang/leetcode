class Solution(object):
    def dailyTemperatures(self, T):
        """
        :type T: list[int]
        :rtype: list[int]
        """
        stack = []
        ans = [0] * len(T)

        # 遍历T
        for i, t in enumerate(T):
            # 如果栈为空就加入栈中
            # 遍历到每个节点 都为之前的节点更新
            while stack and T[stack[-1]] < t:
                cur = stack.pop()
                ans[cur] = i - cur
            stack.append(i)
        return ans
Solution().dailyTemperatures([73,74,75,71,69,72,76,73])