/**
 * Created by nishita.kheur on 4/2/17.
 */
public class MissingNumber {
    public int missingNumber(int[] nums)
    {
//        int correctSum=((nums.length)*(nums.length+1))/2;
//        int arraySum=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            arraySum=arraySum+nums[i];
//        }
//        return (correctSum-arraySum);

        int xor=0;
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            xor=i^nums[i]^xor;
        }
        return xor^i;
    }
}
