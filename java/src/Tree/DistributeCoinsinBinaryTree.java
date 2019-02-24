package Tree;

import java.util.LinkedList;
import java.util.List;

public class DistributeCoinsinBinaryTree {
    int ans;
    public int distributeCoins(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        ans += Math.abs(left)+Math.abs(right);
        return left+right+root.val-1;

    }

    public static void main(String[] args) {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        LinkedList<SameTree> a = new LinkedList<>();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
