package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<TreeNode>> res = new ArrayList<>();
        while (queue.size() != 0) {
            int size = queue.size();
            List<TreeNode> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node =queue.poll();
                list.add(node);
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
            }
            res.add(list);

        }
        return  res.get(res.size()-1).get(0).val;




    }
}
