/**
 * Created by nishita.kheur on 4/11/17.
 */
public class NumberObject implements Comparable<NumberObject> {
    int number;
    int frequency;

    public NumberObject(int n, int f)
    {
        number=n;
        frequency=f;
    }

    @Override
    public int compareTo(NumberObject o)
    {
        if(this.frequency<o.frequency)
                return 1;
        else
            return -1;
    }


}
