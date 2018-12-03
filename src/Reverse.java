import java.util.Stack;

/**
 * Created by nishita.kheur on 2/12/17.
 */
//Learnings:- 1) check for null 2) for loop takes boolean 3)stringbuilder takes lastelementnumber+1 4) stringbuffer is the best. can just do .toString  5) \\s+
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

    public String reverseSentence(String mySentence)
    {
        StringBuffer sb = new StringBuffer();
        String mywordsArray[] = mySentence.split("\\s+");
        for(int j=0;j<mywordsArray.length;j++)
        {
            sb.append(reverseMethod(mywordsArray[j])).append(" ");
        }
        return sb.toString().trim();
    }
}
