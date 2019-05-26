/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        for(int i=0;i<=nums.length;i++){
            dfs(nums,cur,res,i,0);
        }
        return res;
    }
    
    /**
    n 表示我要取多少个元素
    s 表示起始的index
    **/
    public void dfs(int[] nums,List<Integer> cur,List<List<Integer>> res,int n,int s){
        if(cur.size() == n){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = s;i<nums.length;++i){
            cur.add(nums[i]);
            dfs(nums,cur,res,n,i+1);
            cur.remove(cur.size()-1);
        }
    }
}

