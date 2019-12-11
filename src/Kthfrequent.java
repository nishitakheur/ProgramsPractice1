import java.util.*;

/**
 * Created by nishita.kheur on 4/10/17.
 */
//Collections.sort only use list
public class Kthfrequent {
    public void topKFrequent(int[] nums, int k)
    {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        List<NumberObject> l=new ArrayList<NumberObject>();
        for(Integer n:hm.keySet())
        {
            l.add(new NumberObject(n,hm.get(n)));
        }
        Iterator itr=l.iterator();
        Collections.sort(l);
        for(NumberObject no: l)
        {
            //System.out.println("At position"+" "+i+" "+"is"+" "+itr.next());
            System.out.println(no.number+" "+no.frequency);
        }
    }
}
