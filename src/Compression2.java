//https://leetcode.com/problems/string-compression/
//array declaration: int a[] = new int[20];
//Hashmap: get(),put(),hm.keySet(),hm.values(),containsKey();
//string to array conversion:use split() method
import java.util.HashMap;

public class Compression2 {
    public int compress(char[] chars) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<chars.length;i++)
        {
            if(hm.containsKey(chars[i]))
                hm.put(chars[i],hm.get(chars[i])+1);
            else
                hm.put(chars[i],1);
        }
        StringBuffer sbr = new StringBuffer();
        for(Character s:hm.keySet())
        {
            if(hm.get(s)==1)
                sbr.append(s.toString());
            else
                sbr.append(s.toString()).append(hm.get(s));
        }
        return sbr.toString().split("").length;
    }
}
