package Tree;

public class SumofLeftLeaves {
    private int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        getSum(root,false);
        return sum;
    }
    public void getSum(TreeNode root,boolean isLeft){
        if (root ==null){
            return;
        }
        if(isLeft&&root.left==null&&root.right==null){
            sum += root.val;
        }
        getSum(root.left,true);
        getSum(root.right,false);

    }
}
