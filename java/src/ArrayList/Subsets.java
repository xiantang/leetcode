package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        for(int i:nums){

            List<List<Integer>> tmp = new ArrayList<>();;
            for(List<Integer> sub :res){
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);

        }
        return res;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3};
//        List<List<Integer>> res =  new Subsets().subsets(nums);


    }

}
