package ArrayList;

public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        // 定义快慢指针
        int fast = nums[0];
        int slow = nums[0];
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast!=slow);
        int ptr1 =nums[0];
        int ptr2 = slow;
        while (ptr1!=ptr2){
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
        return ptr1;



    }

}
