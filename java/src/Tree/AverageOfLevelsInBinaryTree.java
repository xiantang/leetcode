package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        queue.offer(root);
        while (queue.size() != 0) {
            int queueSize = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < queueSize; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
            }
            double sum = 0;
            for (int n:list
                 ) {
                sum = (double) n + sum;
            }
            lists.add(sum / list.size());
        }
        return lists;
    }

}
