import java.util.HashMap;

/**
 * Created by nishita.kheur on 2/11/17.
 */
//abbccaaccdd
//012345678910
public class Compression {

    public String compressionAlgo(String myString)
    {
        char chArray[]=myString.toCharArray();
        StringBuffer strBuf = new StringBuffer();
        int count = 1;
        for(int i=1;i<chArray.length;i++)
        {
            if(chArray[i]!=chArray[i-1])
            {
                //System.out.println(chArray[i-1]+":"+count);
                strBuf.append(chArray[i-1]+Integer.toString(count));
                count =1;
            }
            else
            {
                count = count + 1;
            }
            if(i==chArray.length-1)
            {
                //System.out.println(chArray[i]+":"+count);
                strBuf.append(chArray[i]+Integer.toString(count));
            }
        }
        return strBuf.substring(0,strBuf.length());

//        HashMap<Character,Integer> hm =new HashMap<Character,Integer>();
//        hm.put(chArray[0], 1);
//        for(int i=0;i<chArray.length;i++)
//        {
//            if(chArray[i+1]==chArray.length-1)
//            {
//                System.out.println(hm);
//            }
//            if(chArray[0]!=chArray[i+1])
//            {
//                System.out.println(hm);
//                hm.clear();
//            }
//            else
//            {
//                if(hm.containsKey(chArray[i]))
//                {
//                    hm.put(chArray[i], hm.get(chArray[i])+1);
//                }
//                else
//                {
//                    hm.put(chArray[i], 1);
//                }
//
//            }
//
//        }
//        return "Nishi";



    }
}
