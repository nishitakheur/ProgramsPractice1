import java.util.HashSet;

/**
 * Created by nishita.kheur on 3/31/17.
 */

//Always make sure to run code till end of loop. Edsge cases, last elements have to be captured in a sepearte if
public class ConsequitiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current_max=0;
        int final_max=0;
        for(int i=0;i<=nums.length; i++)
        {
            if(i==nums.length||nums[i]==0)
            {
                if(current_max>final_max)
                {
                    final_max=current_max;
                }
                current_max=0;
            }
            else
                current_max++;
        }
        return final_max;

    }
}
