/*
 * @lc app=leetcode id=137 lang=java
 *
 * [137] Single Number II
 */
class Solution {
    private Map<Integer,Integer> map = new HashMap<>();
    public int singleNumber(int[] nums) {
        for(int i =0;i<nums.length;i++){
            
            if(map.get(nums[i]) ==null){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()== 1){
                return entry.getKey();
            }
        }
        return -1;

    }
}

