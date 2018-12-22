class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        mini = float("inf")  # 取一个最大值
        pro = 0
        # 如果遇到比mini还小的价格 那么肯定这个价格之后的最大盈利大于mini
        for price in prices:
            if price < mini:
                mini = price
            else:
                pro = max(pro, price - mini)
        return pro
