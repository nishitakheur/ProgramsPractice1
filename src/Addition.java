/**
 * Created by nishita.kheur on 3/3/17.
 */
//Brackets are soooooo important-(a&b)
public class Addition {
    public int addition(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        int sum=a^b;
        int carry=(a&b)<<1;
        return addition(sum, carry);

    }
}
