from collections import Counter


class Solution:
    def hasGroupsSizeX(self, deck):
        # 计算每个数目的count
        count = Counter(deck)
        # 计算最小的count
        min_count = count.most_common()[-1][-1]
        if min_count < 2:
            return False
        partition_size = min_count
        # 遍历每个数字
        for card in count:
            remainder = count[card] % min_count
            # 找到他们的最大公约数
            if remainder > 1:
                partition_size = min(partition_size, remainder)
        for card in count:
            if count[card] % partition_size != 0:
                return False
        return True


if __name__ == '__main__':
    print(Solution().hasGroupsSizeX([1,1,2,2,2,2]))
