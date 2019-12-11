//
import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurances2 {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length==0)
            return true;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
                hm.put(arr[i],1);
        }
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i:hm.values())
        {
            hs.add(i);
        }
        if(hm.values().size()==hs.size())
            return true;
        else
            return false;

    }
}
