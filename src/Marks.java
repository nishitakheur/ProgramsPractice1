

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by nishita.kheur on 2/12/17.
 */
public class Marks {
    public TreeMap sortMarks(HashMap<String,Integer> hm)
    {
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        for(String name:hm.keySet())
        {
            int marks = hm.get(name);
            treeMap.put(marks,name);

        }
        return treeMap;
    }
}
