/**
 * Created by nishita.kheur on 6/22/17.
 */
//f(strs == null || strs.length == 0)--to check empty array
//dont do j++ in 2 places dumass

public class LCPrefix {
    public String longestCommonPrefix(String strs[])
    {
//        int minLength=strs[0].length();
//        int currLength=0;
//        for(int i=0;i<strs.length;i++)
//        {
//            currLength=strs[i].length();
//            minLength= Math.min(currLength,minLength);
//        }
//
//        int correctSum=0;
//        StringBuilder strbldr = new StringBuilder();
//        for(int i=0;i<minLength;i++)
//        {
//            correctSum=(int)strs[0].charAt(i)*strs.length;
//            int calculatedSum=0;
//            for(int j=0;j<strs.length;j++)
//            {
//                calculatedSum = calculatedSum+(int)strs[j].charAt(i);
//            }
//            if (calculatedSum==correctSum)
//                strbldr.append(strs[0].charAt(i));
//            else
//                break;
//        }
//        return strbldr.toString();
        if(strs == null || strs.length == 0)
            return "";
        String pre = strs[0];
        for (int j = 1; j < strs.length; j++) {
            while (strs[j].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }

        }
        return pre;


    }
}
