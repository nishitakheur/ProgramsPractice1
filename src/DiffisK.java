import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
//Declaration of set and map. S, M and ()
//else is not needed. When incrementing count, add that too in map
/**
 * Created by nishita.kheur on 3/29/17.
 */
public class DiffisK {
    public int diffIsKMethod(int nums[],int k){
        if(nums==null ||nums.length==0)
            return 0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int count =0;
        for(Integer e: hs)
        {
            if(hm.containsKey(e)) {
                count++;
            }

            hm.put(e-2,e);
            hm.put(e+2,e);

        }
        return count;
//        if (k < 0) { return 0; }
//
//        Set<Integer> starters = new HashSet<Integer>();
//        Set<Integer> uniqs = new HashSet<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            if (uniqs.contains(nums[i] - k)) starters.add(nums[i] - k);
//            if (uniqs.contains(nums[i] + k)) starters.add(nums[i]);
//            uniqs.add(nums[i]);
//        }
//
//        return starters.size();
    }
}
