/**
 * Created by nishita.kheur on 4/9/17.
 */
//char[] word
//return new String(word);
public class Reverse1 {
    public String reverseString(String s) {
        if(s==null||s.length()==0||s.equals(""))
            return "";
        char a[]=s.toCharArray();
        StringBuffer sbfr=new StringBuffer();
        for(int i=a.length-1;i>=0;i--)
        {
            sbfr.append(a[i]);
        }
        return sbfr.toString();

    }
}
