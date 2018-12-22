package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MaxChunksToMakeSorted {
    public int maxChunksToSorted(int[] arr) {
//        List<List<Integer>> res = new ArrayList<>();

        int max = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            if(max==i) ans++;
        }
        return ans;
    }
}
