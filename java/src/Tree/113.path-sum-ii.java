/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
 *
 * https://leetcode.com/problems/path-sum-ii/description/
 *
 * algorithms
 * Medium (39.41%)
 * Total Accepted:    213.5K
 * Total Submissions: 541.5K
 * Testcase Example:  '[5,4,8,11,null,13,4,7,2,null,null,5,1]\n22'
 *
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's
 * sum equals the given sum.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Example:
 * 
 * Given the below binary tree and sum = 22,
 * 
 * 
 * ⁠     5
 * ⁠    / \
 * ⁠   4   8
 * ⁠  /   / \
 * ⁠ 11  13  4
 * ⁠/  \    / \
 * 7    2  5   1
 * 
 * 
 * Return:
 * 
 * 
 * [
 * ⁠  [5,4,11,2],
 * ⁠  [5,8,4,5]
 * ]
 * 
 * 
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
         res = new LinkedList<>();
        dfs(root,sum,new LinkedList<Integer>());
        return res;
    }
    public void dfs(TreeNode root,int sum, LinkedList<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        if(root.left == null && root.right ==null){
            if(sum == root.val){
                System.out.println(list.size());
                res.add(new ArrayList<Integer>(list));
            }
            return;
        }
        
        
            if(root.left!=null) {
                dfs(root.left,sum-root.val,list);
                list.remove(list.size()-1);
            }
            if(root.right!=null) {
                dfs(root.right,sum-root.val,list);
                list.remove(list.size()-1);
            }
        }
    }
}

