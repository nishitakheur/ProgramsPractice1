/**
 * Created by nishita.kheur on 4/8/17.
 */
//Learning was (s==null||s.length()==0||s.equals(" "))
public class LastWord {
    public int lengthOfLastWord(String s)
    {
        String lastWord;
        if(s==null||s.length()==0||s.equals(" "))
            return 0;

        String a[]=s.split(" ");
        if (a.length!=0)
        {
            lastWord =a[a.length-1];
            if(lastWord!=null&&lastWord.length()!=0)
            {
                return lastWord.length();
            }
            else
                return 0;
        }
        else
            return 0;





    }
}
