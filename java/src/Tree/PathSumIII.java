package Tree;

public class PathSumIII {private int res;
    public int pathSum(TreeNode root, int sum) {
        orderTheTree(root,sum);
        return res;
    }
    public void orderTheTree(TreeNode root,int sum){
        if(root==null){
            return;
        }
//        if(root.val < sum){
            addRes(root,sum);
//        }
        orderTheTree(root.left,sum);
        orderTheTree(root.right,sum);
    }
    public void addRes(TreeNode root,int sum){
        if(root==null){
            return;
        }
        if(sum==root.val){
            res += 1;}
        addRes(root.left,sum-root.val);
        addRes(root.right,sum-root.val);



    }

}


