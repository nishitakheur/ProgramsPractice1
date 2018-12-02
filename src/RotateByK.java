/**
 * Created by nishita.kheur on 4/8/17.
 */
public class RotateByK {
    public void rotate(int[] nums, int k) {
                k=nums.length/k;
                reverse(nums, 0, k);
                reverse(nums, k + 1, nums.length - 1);
                reverse(nums, 0, nums.length - 1);


    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

//public void rotate(int[] nums, int k) {
//    k %= nums.length;
//    reverse(nums, 0, nums.length - 1);
//    reverse(nums, 0, k - 1);
//    reverse(nums, k, nums.length - 1);
//}
//
//    public void reverse(int[] nums, int start, int end) {
//        while (start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//    }

}
