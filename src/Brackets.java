import java.util.HashMap;
import java.util.Stack;

/**
 * Created by nishita.kheur on 2/12/17.
 */
//Rfer the other ome
public class Brackets {
    public Boolean isCorrect(String myString)
    {
        String strArr[]=myString.split("");
        if (strArr.length%2!=0)
        {
            return false;
        }

        HashMap<String,String> hm = new HashMap<String, String>();
        hm.put("[","]");
        hm.put("(",")");
        hm.put("{","}");
        hm.put("<",">");

        Stack<String> stck = new Stack<String>();
        for(int i=0;i<strArr.length;i++)
        {
            stck.push(strArr[i]);
        }
        for(int i=0;i<strArr.length/3;i++)
        {
            String popped = stck.pop();
            String stringCorrespond = hm.get(strArr[i]);
            if(!popped.equals(stringCorrespond))
            {
                return false;
            }

        }
        return true;
    }
}
