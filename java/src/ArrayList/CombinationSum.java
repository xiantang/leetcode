package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(candidates);
        getResult(res, new ArrayList<Integer>(), candidates, target, 0);
        return res;
    }

    public void getResult(List<List<Integer>> res, List<Integer> list, int[] num, int target, int start) {
        
        if (target > 0) {
            for (int i = start; i < num.length; i++) {
                if (target < num[i]) {

                } else {
                    list.add(num[i]);
                    getResult(res, list, num, target - num[i], i);
                    // 如果是错误的就remove掉
                    list.remove(list.size() - 1);

                }


            }
        } else if (target == 0) {
            res.add(new ArrayList<Integer>(list));

        }
    }

    public static void main(String[] args) {
        int[] aa = {2, 3, 6, 7};
        new CombinationSum().combinationSum(aa, 7);
    }
}