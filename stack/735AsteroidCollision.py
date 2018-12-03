class Solution(object):
    def asteroidCollision(self, asteroids):
        res = []
        for asteroid in asteroids:
            # 情况1 相离 <- ->  stack[-1] <0  asteroid >0
            if not res or asteroid > 0:
                res.append(asteroid)
            else:
                # 负数 <-
                # 正数 ->



                 # 只有栈顶的元素为正才会相撞
                while res and res[-1] > 0:
                    # 情况1 相撞 -> <-  stack[-1] >0  asteroid <0
                    if res[-1] < -asteroid:
                        res.pop()
                        # keep destroying stack
                    elif res[-1] > -asteroid:
                        break
                    else:
                        res.pop()
                        break

                # 负的摧毁了所有之前的陨石
                else:
                    res.append(asteroid)
        return res


