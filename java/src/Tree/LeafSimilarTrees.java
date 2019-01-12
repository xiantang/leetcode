package Tree;

import java.util.ArrayList;

public class LeafSimilarTrees {
    private ArrayList<Integer> treeFirst;
    private ArrayList<Integer> treeSecond;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        treeFirst = new ArrayList<Integer>();
        treeSecond = new ArrayList<Integer>();

        oderTree(root1,true);
        oderTree(root2,false);

        return equals(treeFirst,treeSecond);
    }

    public  boolean equals(ArrayList<Integer> a, ArrayList<Integer> b) {

        if(a.size() != b.size()){
            return false;
        }
        for (int i=0; i<a.size(); i++)
            if (a.get(i) != b.get(i)) return false;
        return true;
    }


    public void oderTree(TreeNode root,boolean isFirst){
        if(root == null){
            return;
        }
        if(root.left==null && root.right ==null){
            if(isFirst)
                treeFirst.add(root.val);
            else
                treeSecond.add(root.val);
        }
        oderTree(root.left,isFirst);
        oderTree(root.right,isFirst);

    }
}
