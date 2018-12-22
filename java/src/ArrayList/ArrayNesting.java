package ArrayList;

public class ArrayNesting {
    class Solution {
        boolean[] seen;


        public int arrayNesting(int[] nums) {
            seen = new boolean[nums.length];
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                if (!seen[i]) {
                    int count = longest(nums, i, 0);
                    res = Math.max(res, count);
                }
            }
            return res;


        }

        public int longest(int[] nums, int index, int count) {
            int nextNum = nums[index];
            if (seen[nextNum]) {
                return count;
            } else {
                seen[nextNum] = true;
                return longest(nums, nextNum, ++count);
            }

        }
    }
}
