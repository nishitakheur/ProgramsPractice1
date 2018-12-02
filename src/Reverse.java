import java.util.Stack;

/**
 * Created by nishita.kheur on 2/12/17.
 */
public class Reverse{

    public String reverseMethod(String myString)
    {
        if(myString==null||myString.isEmpty())
        {
            return "";
        }
        StringBuilder sbr = new StringBuilder();
        char ch[] = myString.toCharArray();
        for (int i=myString.length()-1;i>=0;i--)
        {
            sbr.append(ch[i]);
        }
        return sbr.substring(0,myString.length());

    }
}
