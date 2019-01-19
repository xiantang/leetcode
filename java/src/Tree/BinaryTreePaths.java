package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    private List<String> res;
    public List<String> binaryTreePaths(TreeNode root) {
        String pre = "";
        res = new ArrayList<>();
        if(root == null){
            return res;
        }
        getPath(root,pre);
        return res;
    }

    public void getPath(TreeNode root,String pre){
        if(root == null){
            return;
        }
        if(root.left==null&&root.right==null){
            System.out.println(root);
            String del = pre+"->"+root.val;
            res.add(del.substring(2));
        }
        else{
            getPath(root.left,pre+"->"+root.val);
            getPath(root.right,pre+"->"+root.val);
        }

    }
}
