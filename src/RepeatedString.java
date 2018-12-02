/**
 * Created by nishita.kheur on 4/9/17.
 */
//substring NOT subString
    //0,m is actually 0 to m-1 in substring
    //Use string buffer-it is syncronouse but also slow
public class RepeatedString {
    public boolean repeatedSubstringPattern(String s) {
        int lengthString=s.length();
        for(int i=lengthString/2;i>1;i++)
        {
            if(lengthString%i==0)
            {
                int m=lengthString/i;
                String subString = s.substring(0,i);
                StringBuffer sbfr = new StringBuffer();
                for(int j=1;j<=m;j++)
                {
                    sbfr.append(subString);
                }
                if(sbfr.toString().equals(s))
                    return true;
            }
        }
        return false;

    }
}
