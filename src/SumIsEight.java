/**
 * Created by nishita.kheur on 2/19/17.
 */

import java.util.*;
//ascending
public class SumIsEight {
    public void sumTotal(int a[]){

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<a.length;i++)
        {
            if (hs.contains(a[i]))
            {
                int number=8-a[i];
                System.out.println(a[i]+","+number);
            }
            hs.add(8-a[i]);
        }

    }
}
