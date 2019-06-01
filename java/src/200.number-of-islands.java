/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */
class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        if(grid.length == 0){return 0;}
        boolean [][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                
                if(visited[i][j]==false&&grid[i][j] == '1'){
                    res +=1;
                    dfs(grid,visited,i,j);
                }   
            }
        }
        return res;
    }
    
    
    public void dfs(char[][] grid, boolean [][] visited,int i,int j){
        if(visited[i][j] == true||grid[i][j] == '0'){
            return ;
        }
            
             visited[i][j] = true;
            if(i+1<grid.length){
                dfs(grid,visited,i+1,j);
            }
            if(i-1>=0){
                dfs(grid,visited,i-1,j);
            }
            if(j-1>=0){
                dfs(grid,visited,i,j-1);
            }
            if(j+1<grid[0].length){
                dfs(grid,visited,i,j+1);
            }
            
        
       
    }
}

