import java.util.HashSet;

/**
 * Created by nishita.kheur on 4/7/17.
 */
public class NearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//
//         for(int i=0;i<nums.length-1;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 if(nums[i] == nums[j])
//                 {
//                     if(Math.abs(i-j)<=k||(i==0&&j<=k))
//                     return true;
//
//                 }
//
//             }
//         }
//         return false;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(i>k)
                hs.remove(nums[i-k-1]);
            if(!hs.add(nums[i]))
                return true;
        }
        return false;

    }
}
