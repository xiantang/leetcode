package Tree;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    private List<Integer> res;

    public List<Integer> preorder(Node root) {
        res = new ArrayList<>();
        preorde(root);
        return res;
    }

    public void preorde(Node root){
        if(root==null)
            return;
        else
            res.add(root.val);
        for (Node node:root.children
        ) {
            preorde(node);
        }



    }
}
