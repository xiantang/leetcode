/*
 * @lc app=leetcode id=133 lang=java
 *
 * [133] Clone Graph
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    Map<Integer,Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
       
        return dfs(node);
    }
    
    public Node dfs(Node node){
        if(node == null){
            return null;
        }
         if (map.containsKey(node.val)){
             return map.get(node.val);
        }
        
        Node res =  new Node(node.val, new ArrayList<Node>());
    
        map.put(res.val,res);
        for (Node neighbor : node.neighbors) 
            res.neighbors.add(dfs(neighbor));
        return res;
        
        
    }
}

