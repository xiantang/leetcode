package ArrayList;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[][] res = grid;
        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(i==0&&j==0){

                }

                else if(i==0){
                    res[i][j] = res[i][j]+res[i][j-1];

                }
                else if(j==0){
                    res[i][j] = res[i][j]+res[i-1][j];

                }
                else{
                    res[i][j] = Math.min(grid[i][j]+grid[i-1][j],grid[i][j]+grid[i][j-1]);
                }

            }

        }

        return res[grid.length-1][grid[0].length-1];
    }
}
