/**
 * Created by nishita.kheur on 4/10/17.
 */
//Learning is that, sentence and reversal like this will take the for loop ONLY
//Remember to say split oon //s+ for multiple spaces
//Remember to append " " after every word and use trim()
public class Reverse2 {
    public String reverseWords(String s) {
        if(s==null||s.equals("")||s.length()==0)
            return  "";
        String a[]=s.split("\\s+");
        StringBuffer sbfr = new StringBuffer();
        for(int i=a.length-1;i>=0;i--)
        {
            sbfr.append(a[i]).append(" ");
        }
        return sbfr.toString().trim();



    }
}
