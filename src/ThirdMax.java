
import java.util.*;

/**
 * Created by nishita.kheur on 4/1/17.
 */
public class ThirdMax {
    public int thirdMax(int[] nums)
    {
        TreeSet<Integer> ts = new TreeSet<Integer>(Collections.reverseOrder());
        int loopToRun=0;
        int elementToReturn=0;
        for(int j=0;j<nums.length;j++)
        {
            ts.add(nums[j]);
        }

        int maxPosition=ts.size();
        if (maxPosition<3)
        {
                return ts.pollFirst();

        }
        else
        {
            Iterator itr = ts.iterator();
            loopToRun = 3;
            for(int i=1;i<=loopToRun;i++)
            {
               elementToReturn = (int)itr.next();
            }
            return elementToReturn;

        }


    }



}


