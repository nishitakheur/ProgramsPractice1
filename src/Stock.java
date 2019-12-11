/**
 * Created by nishita.kheur on 4/1/17.
 */
public class Stock {
    public int maxProfit(int[] prices) {
//        int profit=0;
//        for(int i=0;i<prices.length;i++)
//        {
//            for(int j=i+1;j<prices.length;j++)
//            {
//                if(prices[j]-prices[i]>0&&prices[j]-prices[i]>profit)
//                    profit=prices[j]-prices[i];
//            }
//        }
//        return profit;
        int minValue = Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i< prices.length;i++)
        {
            minValue = Math.min(minValue, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minValue);
        }
        return  maxProfit;


    }
}
