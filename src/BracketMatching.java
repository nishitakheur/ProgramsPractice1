/**
 * Created by nishita.kheur on 4/8/17.
 */
//char not Char
//Character is always ''
//Please mention even  wala condition
//Pleasemention string null
//For hasmaps always use the containsKey
//Stack is the correct way of doing this
//make sure to use else if
//Charcter to char is made by (char)
//stck.isEmpty()
import java.util.HashMap;
import java.util.Stack;

public class BracketMatching {
    public boolean isValid(String s) {
        if(s==null||s.length()==0||s.equals(""))
            return false;
        Stack<Character> stck = new Stack<Character>();
        char a[]=s.toCharArray();
        if(a.length%2!=0)
            return false;
        for(int i=0;i<a.length;i++)
        {

            if(a[i]=='(')
                stck.push(')');
            else if(a[i]=='{')
                stck.push('}');
            else if(a[i]=='[')
                stck.push(']');
            else if(stck.isEmpty()||(char)stck.pop()!=a[i])
                    return false;
        }
        return stck.isEmpty();



    }
}
