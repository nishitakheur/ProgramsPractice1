/**
 * Created by nishita.kheur on 2/19/17.
 */
//character is '' not ""
import java.lang.*;
public class SpaceWith20 {
    public String replace(String str)
    {
//        StringBuilder stB = new StringBuilder();
//        char a[]=str.toCharArray();;
//        for (int i=0;i<a.length;i++)
//        {
//            if(a[i]==' ')
//                stB.append("%20");
//            else
//                stB.append(Character.toString(a[i] ));
//        }
//        return stB.substring(0,stB.length());
        return (str.replace(" ","%20"));
    }
}
