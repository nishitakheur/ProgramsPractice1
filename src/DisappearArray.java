import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by nishita.kheur on 3/31/17.
 */

//Learning is that if you have to find max, use a for loop instead of sorting

public class DisappearArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> al = new ArrayList<Integer>();
        int n= nums.length;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        for (int i=1;i<=n;i++)
        {
            if(!hs.contains(i))
            {
                al.add(i);
            }
        }
        return al;

    }
}
