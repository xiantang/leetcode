package Tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    private List<Integer> res;

    public List<Integer> postorder(Node root) {
        res = new ArrayList<>();

        postorde(root);
        return res;
    }

    public void postorde(Node root) {
        if (root == null)
            return;

        for (Node node : root.children
        ) {
            postorde(node);
        }
        res.add(root.val);

    }
}
