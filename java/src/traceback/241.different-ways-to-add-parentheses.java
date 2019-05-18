/*
 * @lc app=leetcode id=241 lang=java
 *
 * [241] Different Ways to Add Parentheses
 */
class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        return ways(input);
    }
    
    public List<Integer> ways(String input){
        List<Integer> ret = new LinkedList<Integer>();
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i) == '+' || input.charAt(i)=='-'||input.charAt(i)=='*'){
                String part1 = input.substring(0, i);
                String part2 = input.substring(i+1);
                List<Integer> l1 = ways(part1);
                List<Integer> l2 = ways(part2);
                for(Integer p1:l1){
                    for(Integer p2:l2 ){
                        int c = 0;
                        
                        switch(input.charAt(i)){
                          case '+': c = p1+p2;
                                break;
                            case '-': c = p1-p2;
                                break;
                            case '*': c = p1*p2;
                                break;
                        }
                        
                        ret.add(c);
                    }
                }
                }
                
            }
        if(ret.size()==0){
             ret.add(Integer.valueOf(input));
        }
        return ret;
            
            
        }
}

