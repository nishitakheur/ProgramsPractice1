import java.util.HashMap;

/**
 * Created by nishita.kheur on 6/25/17.
 */

//some times order of the special conditions with if if are very important
//Always beware while using hasmmap.get. u can do containsKey instead
//
public class RansomNotes {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()==0&&ransomNote.length()==0 )
            return true;
        if(magazine==null || magazine.length()==0)
            return false;
        if(magazine.length()<ransomNote.length())
            return false;

        HashMap<Character,Integer> ransomNoteMap = createHashMap(ransomNote);
        HashMap<Character,Integer> magazineMap = createHashMap(magazine);

        for(int j=0;j<ransomNote.length();j++)
        {
            if(!magazineMap.containsKey(ransomNote.charAt(j))||ransomNoteMap.get(ransomNote.charAt(j))>magazineMap.get(ransomNote.charAt(j)))
            {
                return false;
            }
        }
        return true;
    }

    public HashMap<Character,Integer> createHashMap(String myString)
    {
        HashMap<Character,Integer> myMap = new HashMap<Character, Integer>();
        for(int i=0;i<myString.length();i++)
        {
            if(myMap.containsKey(myString.charAt(i)))
                myMap.put(myString.charAt(i),myMap.get(myString.charAt(i))+1);
            else
                myMap.put(myString.charAt(i),1);

        }
        return myMap;

    }


}
