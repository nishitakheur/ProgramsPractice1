/**
 * Created by nishita.kheur on 4/9/17.
 */
public class ValidCaps {
//    public boolean detectCapitalUse(String word) {
//        if(word == null && word.equals("")){
//            return false;
//        }
//
//        char[] letters = word.toCharArray();
//        boolean isCapitalExpected = false;
//
//        for(int i=1; i<letters.length; i++)
//        {
//            if(i==1 && Character.isLowerCase(letters[i])){
//                isCapitalExpected = false;
//                continue;
//            }
//
//            if(i==1 && !Character.isLowerCase(letters[i])){
//                isCapitalExpected = true;
//                continue;
//            }
//
//            if(Character.isLowerCase(letters[i]) && isCapitalExpected == true){
//                return false;
//            }
//
//            if(!Character.isLowerCase(letters[i]) && isCapitalExpected == false){
//                return false;
//            }
//
//            if(i == letters.length && isCapitalExpected == true)
//            {
//                if(!Character.isLowerCase(letters[0])){
//                    return true;
//                }
//                else{
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    public boolean detectCapitalUse(String word) {
        if(word.length()==0||word.equals("")||word==null)
            return false;
        if(word.length()==1)
            return true;
        char a[]=word.toCharArray();
        Boolean b[]=new Boolean[a.length];
        for(int i=0;i<a.length;i++)
        {
            if(Character.isLowerCase(a[i]))
                b[i]=false;
            else
                b[i]=true;

        }
        for(int i=1;i<a.length-1;i++)
        {
            if(b[i]!=b[i+1])
                return false;
        }
        return(b[0]==true&&b[1]==true||b[0]==false&&b[1]==false||b[0]==true&&b[1]==false);
    }
}
