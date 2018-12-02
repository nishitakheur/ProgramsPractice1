import java.util.Stack;

/**
 * Created by nishita.kheur on 2/12/17.
 */
public class Palindrome {
    public Boolean findPalindrome(String myString)
    {
        if(myString ==null || myString.isEmpty())
        {
            return false;
        }
        char chArr[] = myString.toCharArray();
        Stack<Character> stck = new Stack<Character>();
        for(int i=0; i<chArr.length;i++)
        {
            stck.push(chArr[i]);
        }
        for(int i=0; i<chArr.length;i++)
        {
            char popedElement= stck.pop();
            if(chArr[i]!=popedElement)
                return false;
        }
        return true;

    }
}
