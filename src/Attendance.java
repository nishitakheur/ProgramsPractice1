//(a[i] == a[i + 1])&&a[i+1]== a[i + 2]) use && to compare 3 items
//Dont ignore if late condition
//ALWAYS REMEMEBER hm.get could give a nnull pointer

import java.util.HashMap;

/**
 * Created by nishita.kheur on 6/15/17.
 */
public class Attendance {
    public boolean checkRecord(String s) {
        char a[]= s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<a.length;i++)
        {
            if(hm.containsKey(a[i]))
                hm.put(a[i],hm.get(a[i])+1);
            else
                hm.put(a[i],1);

            if(!(i>=a.length-2)) {
                if ((a[i] == a[i + 1])&&a[i+1]== a[i + 2])
                    return false;
            }

        }
            if(hm.get('A')>1)
                return false;
            else
                return true;
    }
}

