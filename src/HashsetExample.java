//http://www4.ncsu.edu/~kaltofen/courses/Languages/JavaExamples/jgl3.1.0/doc/api/com.objectspace.jgl.examples.HashSetExamples.html
//http://beginnersbook.com/2014/08/how-to-iterate-over-a-sethashset/

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by nishita.kheur on 2/11/17.
 */
//String compression
public class HashsetExample {


    public String removeDuplicates(String myString)
    {
        char chArray[] = myString.toCharArray();
        HashSet<Character> hset = new HashSet<Character>();
        for (int i=0; i<chArray.length;i++)
        {
            hset.add(chArray[i]);
        }
        System.out.println(hset.contains('h'));
        HashSet<Character> hset2 = new HashSet<Character>();

        StringBuilder strBuilder = new StringBuilder();
        Iterator iter = hset.iterator();
//        while(iter.hasNext())
//        {
//            strBuilder.append(iter.next());
//        }
        for (Character ch:hset)
        {
            strBuilder.append(ch);
        }
         return strBuilder.substring(0,strBuilder.length());
    }
}
