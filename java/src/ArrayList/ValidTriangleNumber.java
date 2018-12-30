package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidTriangleNumber {
    private int count;
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i = nums.length-1;i>=2;i--){
            int left = 0;
            int right = i-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    res+=right-left;
                    right--;
                }

                else{
                    left ++;
                }


            }


        }
        return res;

    }

    public static void main(String[] args) {
        new ValidTriangleNumber().triangleNumber(new int[]{2,2,3,4});
    }
}
