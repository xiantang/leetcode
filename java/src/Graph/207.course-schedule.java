/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */
class Solution {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList();
        }
        for(int i = 0;i<prerequisites.length;i++){
            graph[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        boolean[] visited = new boolean[numCourses];
        for(int i = 0;i<numCourses;i++){
            if(!dfs(visited,graph,i)){
                return false;
            }
        }
        
        return true;
    }
    
    
    public boolean dfs(boolean[] visited,ArrayList[] graph,int course){
        if(visited[course]){
            return false;
        }
        visited[course] = true;
        for(int i =0;i<graph[course].size();i++){
            if(!dfs(visited,graph,(int)graph[course].get(i))){
                return false;
            }
            
        }
        visited[course] = false;
        return true;
    
        
    }
}

