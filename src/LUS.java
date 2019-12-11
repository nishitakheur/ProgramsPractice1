/**
 * Created by nishita.kheur on 6/19/17.
 */
public class LUS {
    public int findLUSlength(String a, String b) {
        if (a.equals(b))
            return -1;
        else
            return Math.max(a.length(),b.length());
    }
}
