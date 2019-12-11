/**
 * Created by nishita.kheur on 6/25/17.
 */
public class CountSay {

    public String countAndSay(int n){
        StringBuffer sbfr = new StringBuffer();
        if(n==1)
        {
            return "1";
        }
        if(n==2)
        {
            return "11";
        }
        String head = "11";
        for(int i=0;i<n-2;i++)
        {
            int count=1;
            String[] headArray = head.split("");
            for(int j=1;j<headArray.length;j++)
            {
                if(headArray[j].equals(headArray[j-1]))
                {
                    count++;
                }
                else
                {
                    sbfr.append(Integer.toString(count)).append(headArray[j-1]);
                    count = 1;
                }
            }
            sbfr.append(Integer.toString(count)).append(headArray[headArray.length-1]);
            head = sbfr.toString();
            sbfr.delete(0,sbfr.length());
        }
        return head;
    }

}
