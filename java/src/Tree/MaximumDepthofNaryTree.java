package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumDepthofNaryTree {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public int maxDepth(Node root) {
        int maxDepth = 0;

        return maxDepth(root,maxDepth);
    }

    public int maxDepth(Node root,int maxDepth){
        if(root == null){
            return maxDepth;
        }
        maxDepth +=1;
        ArrayList<Integer> nums = new ArrayList<>();
        for(Node node:root.children){
            int depth = maxDepth(node,maxDepth);
            nums.add(depth);
        }
        if(nums.size()==0){
            return maxDepth;
        }
        else
            return Collections.max(nums);
    }


}
