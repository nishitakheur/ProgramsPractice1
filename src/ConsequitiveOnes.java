import java.util.HashSet;
//https://leetcode.com/problems/max-consecutive-ones/submissions/
/**
 * Created by nishita.kheur on 3/31/17.
 */

//Always make sure to run code till end of loop. Edsge cases, last elements have to be captured in a sepearte if
public class ConsequitiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
//        int current_max=0;
//        int final_max=0;
//        for(int i=0;i<=nums.length; i++)
//        {
//            if(i==nums.length||nums[i]==0)
//            {
//                if(current_max>final_max)
//                {
//                    final_max=current_max;
//                }
//                current_max=0;
//            }
//            else
//                current_max++;
//        }
//        return final_max;

        //Inefficient solution with complexity of n2
//        int max=0;
//        if(nums.length==1)
//        {
//            if(nums[0]==1)
//                return 1;
//        }
//        for(int i=0;i<nums.length-1;i++)
//        {
//            int cons = nums[i];
//
//            if(cons==1) {
//                int count=1;
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (nums[j] == cons) {
//                        count++;
//                    } else {
//                        //max = count;
//                        break;
//                    }
//
//                }
//                max = Math.max(max, count);
//            }
//        }
//
//        return max;
        int max = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++)
        {

            if(nums[i]==1)
            {
                count++;
                max= Math.max(count,max);
            }
            else
            {
                count=0;
            }
        }
        return max;

    }
}
