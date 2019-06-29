/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> f = new ArrayList<>(triangle);
        for(int i= 0;i<f.size();i++){
            for(int j =0;j<=i;j++){
                
                int a = f.get(i).get(j);
                if(i==0&&j==0){
                    continue;
                }
                if(i==j){
                    f.get(i).set(j,f.get(i-1).get(j-1)+a);
                    continue;
                }
                if(j==0){
                     f.get(i).set(j,f.get(i-1).get(j)+a);
                    continue;
                }
                f.get(i).set(j,Math.min(f.get(i-1).get(j-1),f.get(i-1).get(j))+a);
                
            }
        }
        
        return  Collections.min(f.get(f.size()-1));
    }
}

