package ArrayList;

public class MaximumLengthOfRepeatedSubarray {
    public int findLength(int[] A, int[] B) {
        int ans = 0;
        int [][] memo = new int[A.length+1][B.length+1];
        for(int i=A.length-1;i>=0;--i){
            for(int j=B.length-1;j>=0;--j){
                if (A[i]==B[j]){
                    memo[i][j] = memo[i+1][j+1]+1;
                    if (memo[i][j]>ans){
                        ans = memo[i][j];
                    }
                }

            }
        }
        return ans;
    }
}
