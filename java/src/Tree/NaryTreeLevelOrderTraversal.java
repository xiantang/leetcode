package Tree;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }


    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();
            if (root == null) {
                return lists;
            }
        queue.offer(root);
        while (queue.size() != 0) {
            int queueSize = queue.size();

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < queueSize; i++) {
                Node node = queue.poll();
                list.add(node.val);
                for (Node subNode : node.children
                ) {
                    queue.offer(subNode);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
