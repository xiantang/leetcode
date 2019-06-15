/*
 * @lc app=leetcode id=491 lang=java
 *
 * [491] Increasing Subsequences
 */
class Solution {
    private List<List<Integer>> res;

    public List<List<Integer>> findSubsequences(int[] nums) {
        res = new LinkedList<>();
        List<Integer> cur = new LinkedList<>();
        dfs(cur,nums,0);
        return res;
    }
    
    public void dfs(List<Integer> cur,int[] nums,int index){
        if(cur.size()>=2){
        
            res.add(new ArrayList<>(cur));          
        }
        Set<Integer> set = new HashSet<>();
        for(int i=index;i<nums.length;i++){
            // 如果添加之后是false 就表明重复 [4 7 7 ]  不存在两个4 7 
            if (!set.add(nums[i])) continue;
            if(cur.isEmpty() ||cur.get(cur.size()-1)<=nums[i]){
                cur.add(nums[i]);   
                dfs(cur,nums,i+1);
                cur.remove(cur.size()-1);
            }
          
        }
    
    }
}

