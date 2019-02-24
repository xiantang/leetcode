package Tree;

import java.util.*;

public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null){
            return res;
        }
        queue.offer(root);

        while (queue.size() != 0) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node =queue.poll();
                list.add(node.val);
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
            }
            int id = Collections.max(list);
            res.add(id);
        }
        return res;
    }
}
