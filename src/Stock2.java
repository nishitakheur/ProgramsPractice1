import java.util.Collections;

import java.util.*;
import java.util.TreeSet;
//learning is that iterator has to be initialized after, treeset if filled in
/**
 * Created by nishita.kheur on 4/2/17.
 */
public class Stock2 {
    public int maxProfit(int[] prices) {
//        int profit=0;
//        for(int i=0;i<prices.length-1;i++)
//        {
//            if(prices[i+1]>prices[i])
//            {
//                profit =profit+prices[i+1]-prices[i];
//            }
//
//        }
//        return profit;
        if(prices==null||prices.length==0)
            return 0;
        int profit=0;
        TreeSet<Integer> ts= new TreeSet<Integer>(Collections.reverseOrder());
        int finalProfit=0;

        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i+1]>prices[i])
            {
                profit =prices[i+1]-prices[i];
                ts.add(profit);
            }
        }
        Iterator itr=ts.iterator();
        for(int j=1;j<=2;j++)
        {
            finalProfit=finalProfit+(int)itr.next();
        }
        return finalProfit;


    }
}
