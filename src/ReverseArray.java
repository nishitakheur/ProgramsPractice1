/**
 * Created by nishita.kheur on 2/19/17.
 */
public class ReverseArray {
    public String rev(String str)
    {
        String a[]=str.split(" ");
        StringBuilder strB = new StringBuilder();
        for (int i=a.length-1; i>=0;i--)
        {
            strB.append(a[i]).append(" ");
        }
        return strB.substring(0,strB.length());
    }
}
