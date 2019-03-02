/*
 * @lc app=leetcode id=449 lang=java
 *
 * [449] Serialize and Deserialize BST
 *
 * https://leetcode.com/problems/serialize-and-deserialize-bst/description/
 *
 * algorithms
 * Medium (45.81%)
 * Total Accepted:    49.8K
 * Total Submissions: 108.7K
 * Testcase Example:  '[2,1,3]'
 *
 * Serialization is the process of converting a data structure or object into a
 * sequence of bits so that it can be stored in a file or memory buffer, or
 * transmitted across a network connection link to be reconstructed later in
 * the same or another computer environment.
 * 
 * Design an algorithm to serialize and deserialize a binary search tree. There
 * is no restriction on how your serialization/deserialization algorithm should
 * work. You just need to ensure that a binary search tree can be serialized to
 * a string and this string can be deserialized to the original tree
 * structure.
 * 
 * The encoded string should be as compact as possible.
 * 
 * Note: Do not use class member/global/static variables to store states. Your
 * serialize and deserialize algorithms should be stateless.
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
public class Codec {

    public String serialize(TreeNode root) {
        // pre-order traversal
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();    
    }
    
    private void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append(root.val + " ");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 0) return null;
        // split the string and change to an integer array
        String[] strNodes = data.split(" ");
        int n = strNodes.length;
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = Integer.parseInt(strNodes[i]);
        }
        
        return deserializeHelper(nodes, 0, n - 1);   
    }
    
    private TreeNode deserializeHelper(int[] nodes, int low, int high) {
        if (low > high) return null;
        TreeNode root = new TreeNode(nodes[low]);
        
        // find the first index that is larger than low
        // [low + 1, j - 1] is the left subtree, [j, high] is the right subtree
        int j = low + 1;
        for (; j <= high; j++) {
            if (nodes[j] > nodes[low]) break;
        }
        root.left = deserializeHelper(nodes, low + 1, j - 1);
        root.right = deserializeHelper(nodes, j, high);
        return root; 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));

