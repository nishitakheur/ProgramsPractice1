/**
 * Created by nishita.kheur on 4/10/17.
 */
//\\ not // for split!!
public class Reverse3 {
    public String reverseEveryWord(String s)
    {
        if(s==null||s.length()==0||s.equals(""))
            return "";
        String a[]=s.split("\\s+");
        StringBuffer stfbr = new StringBuffer();
        for(int i=0;i<a.length;i++)
        {
            stfbr.append(reverseSingleWord(a[i])).append(" ");
        }
        return stfbr.toString().trim();
    }

    public String reverseSingleWord(String s)
    {
        char c[]=s.toCharArray();
        int start=0;
        int end=c.length-1;
        char temp;
        while(start<end)
        {
            temp=c[start];
            c[start]=c[end];
            c[end]=temp;
            start++;
            end--;

        }
        return new String(c);
    }
}
