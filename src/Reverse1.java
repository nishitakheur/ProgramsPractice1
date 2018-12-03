/**
 * Created by nishita.kheur on 4/9/17.
 */
//char[] word
//return new String(word);
public class Reverse1 {
    public String reverseStringSpecial(String s) {
        if(s==null||s.length()==0||s.equals(""))
            return "";
        char a[]=s.toCharArray();
        StringBuffer sbfr=new StringBuffer();
        int j=a.length-1;
        char temp='0';
        for(int i=0;i<a.length/2;i++)
        {
            if(isSpecialCharacter(a[i]))
            {
                i++;
            }
            if(isSpecialCharacter(a[j]))
            {
                j--;
            }
            temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            j--;
        }
        for(int i=0;i<a.length;i++)
        {
            sbfr.append(a[i]);
        }
        return  sbfr.toString();

    }

    public Boolean isSpecialCharacter(char ch)
    {
        if(ch=='!'||ch=='@'||ch=='#')
            return true;
        else
            return false;
    }
}
