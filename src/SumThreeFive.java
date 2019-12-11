/**
 * Created by nishita.kheur on 3/22/17.
 */
public class SumThreeFive {

    public int add()
    {
        int sum =0;
        //for (int i=1;sum+3<1000&&sum+5<1000 ;i++)
        for (int i=1;i<1000 ;i++)
        {
            if(i%3==0)
            {
                sum=sum+i;
                continue;
            }
            else if(i%5==0)
            {
                sum=sum+i;
                continue;
            }
        }
        return sum;
    }
}
