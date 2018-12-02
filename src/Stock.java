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
        int profit=0;
        int min_price= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            min_price= Math.min(min_price,prices[i]);
            profit= Math.max(profit,prices[i]-min_price);
        }
        return profit;
    }
}
