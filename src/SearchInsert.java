/**
 * Created by nishita.kheur on 4/1/17.
 */
//return s/low to insert at position when not found

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        if(nums==null||nums.length==0)
            return -1;
        int s=0;
        int e=nums.length-1;
        int m=0;
        while(s<=e)
        {
            m=(s+e)/2;
            if(nums[m]==target)
                return m;
            if(target>nums[m])
                s=m+1;
            else
                e=m-1;
        }
        return s;

    }
}
