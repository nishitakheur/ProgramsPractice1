/**
 * Created by nishita.kheur on 4/9/17.
 */
public class Segments {
    public int countSegments(String s) {
        String a[]=s.split(" ");
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=null&&a[i].length()!=0&&!a[i].equals(" "))
                count++;
        }
        return count;

    }
}
