/**
 * Created by nishita.kheur on 2/27/17.
 */
public class TrailingZero {
    public int trailing(int a)
    {
        int count = 0;
        for(int i=5; a/i>0; i=i*5)
        {
            count = count + a/i;
        }
        return count;
    }
}
