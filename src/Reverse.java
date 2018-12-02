import java.util.Stack;

/**
 * Created by nishita.kheur on 2/12/17.
 */
public class Reverse{

    public String reverseMethod(String myString)
    {
        if(myString == null || myString.isEmpty())
        {
            return "Empty";
        }
        char chArr[] = myString.toCharArray();
        Stack<Character>  stck = new Stack<Character>();
        for(int i=0; i<chArr.length;i++)
        {
            stck.push(chArr[i]);
        }
        StringBuilder strBuild = new StringBuilder();
        for(int i=0; i<chArr.length;i++)
        {
            strBuild.append(stck.pop());
        }
        return strBuild.substring(0,chArr.length);

    }
}
