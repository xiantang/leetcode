/*
 * @lc app=leetcode id=260 lang=java
 *
 * [260] Single Number III
 */
class Solution {
    private Map<Integer,Integer> map = new HashMap<>();
    public int[] singleNumber(int[] nums) {
        for(int i =0;i<nums.length;i++){
            
            if(map.get(nums[i]) ==null){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()== 1){
                res.add(entry.getKey());
            }
        }
    return res.stream().mapToInt(i->i).toArray();
    }
}

