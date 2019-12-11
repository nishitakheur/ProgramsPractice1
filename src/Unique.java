/**
 * Created by nishita.kheur on 2/19/17.
 */

//boolean-->default is false not Boolean
//str.isEmpty()||str==null

public class Unique {
    public Boolean isUnique(String str)
    {
        if(str.isEmpty()||str==null)
            return false;
        boolean a[]=new boolean[256];
        for(int i=0;i<str.length();i++)
        {
            int position = str.charAt(i);

            if(a[position]==false)
                a[position]=true;
            else
                return false;
        }
        return true;

    }
}
