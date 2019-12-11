/**
 * Created by nishita.kheur on 2/19/17.
 */

//.toLowercase, null
public class Rotation
{
    public Boolean isRotation(String string1, String string2)
    {
        String str1 = string1.toLowerCase();
        String str2 = string2.toLowerCase();
        String s = str2 + str2;
        if(s.indexOf(str1)>=0)
        {
            return true;
        }
        return false;
    }
}
