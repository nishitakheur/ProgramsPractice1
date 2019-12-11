import java.util.HashMap;
//https://leetcode.com/problems/unique-number-of-occurrences/submissions/
//Hashset to add elements, you use hs.add

/**
 * Created by nishita.kheur on 2/3/17.
 */
public class CountOccurances {
    public void countOccurancesMethod(String myString)
    {
        char a[]= myString.toCharArray();
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        for (int i=0; i<a.length; i++){
            char ch = a[i];
            if(m.containsKey(ch)){
                m.put(ch, m.get(ch) + 1);
            }
            else {
                m.put(ch, 1);
            }
        }
        for(Character c: m.keySet()){
            System.out.println(c+" "+m.get(c));
        }
    }
}


