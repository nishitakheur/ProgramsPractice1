/**
 * Created by nishita.kheur on 6/15/17.
 */
///Tip: See that it doesnt fail for "",a---&&
public class FindString {
    public int strStr(String haystack, String needle) {
        if((haystack==null || haystack.length()==0||haystack.equals(""))&&(needle==null||needle.length()==0||needle.equals("")))
            return 0;
        if(haystack.indexOf(needle)>=0)
            return (haystack.indexOf(needle));
        else
            return -1;
    }
}
