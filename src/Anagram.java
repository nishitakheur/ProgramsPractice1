import java.util.HashMap;
import java.util.Objects;
import java.util.Arrays;
import java.util.*;

/**
 * Created by nishita.kheur on 2/4/17.
 */

//Arrays can be sorted
//Strings can be compared
//Array to string --> toString

//MAKE IT A CHAR ARRAY ONLY
//charArray to string --> use new String(a)
    //f(str != null && !str.isEmpty())
public class Anagram {

    public Boolean anagramMethod (String myString1, String myString2) {
//        if(myString1.length()!= myString2.length())
//            return false;
//        else {
//            HashMap<Character, Integer> hm1 = countOccurences(myString1);
//            HashMap<Character, Integer> hm2 = countOccurences(myString2);
//            for(Character k: hm1.keySet())
//            {
//                if(hm1.get(k)==(hm1.get(k)))
//                    continue;
//                else
//                    return false;
//            }
//            return true;
//        }
//
//    }
//    public HashMap countOccurences (String myString){
//        char a[] = myString.toCharArray();
//        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
//        for (int i = 0; i < a.length; i++) {
//            char ch = a[i];
//            if (m.containsKey(ch)) {
//                m.put(ch, m.get(ch) + 1);
//            } else {
//                m.put(ch, 1);
//            }
//        }
//        return m;


//        String s1[] = myString1.split("");
//        String s2[] = myString2.split("");
//        Arrays.sort(s1);
//        Arrays.sort(s2);
//
//
//        if (new String (s1.toString().toCharArray()).equals(new String((s2.toString().toCharArray()))))
//
//        //if(Objects.equals(s1.toString(),s2.toString()))
//        {
//            return true;
//        }
//        return false;

        char s1[] = myString1.toCharArray();
        char s2[] = myString2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);


        if (new String(s1).equals(new String(s2)))
        //if(Objects.equals(s1.toString(),s2.toString()))
        {
            return true;
        }
        return false;


    }
}


