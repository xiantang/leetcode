package Tree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MostFrequentSubtreeSum {
    private Map<Integer, Integer> table;
    private int count;
    private int max = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        table = new HashMap<>();
        createTable(root);

        Iterator<Map.Entry<Integer, Integer>> entries = table.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if (entry.getValue() == max) {
                count += 1;
            }

        }

        int[] res = new int[count];
        int i = 0;
        Iterator<Map.Entry<Integer, Integer>> entrie = table.entrySet().iterator();
        while (entrie.hasNext()) {
            Map.Entry<Integer, Integer> entry = entrie.next();
            // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            if (entry.getValue() == max) {
                res[i] = entry.getKey();
                i++;
            }

        }

        return res;
    }

    public int createTable(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = createTable(root.left);
        int right = createTable(root.right);
        int sum = left + right + root.val;
        if (table.get(sum) == null) {
            table.put(sum, 1);
        } else {
            table.put(sum, 1 + table.get(sum));

        }
        if (table.get(sum) > max) {
            max = table.get(sum);
        }

        return left + right + root.val;

    }

}
