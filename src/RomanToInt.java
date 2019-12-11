import java.util.HashMap;

/**
 * Created by nishita.kheur on 6/19/17.
 */
public class RomanToInt {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('M',1000);
        hm.put('D',500);
        hm.put('C',100);
        hm.put('L',50);
        hm.put('X',10);
        hm.put('V',5);
        hm.put('I',1);

//        String highestChar="";
//
//        if (s.matches(".*M.*"))
//            highestChar = "M";
//        else if(s.matches(".*D.*"))
//            highestChar = "D";
//        else if(s.matches(".*C.*"))
//            highestChar = "C";
//        else if(s.matches(".*L.*"))
//            highestChar = "L";
//        else if(s.matches(".*X.*"))
//            highestChar = "X";
//        else if(s.matches(".*V.*"))
//            highestChar = "V";
//        else if(s.matches(".*I.*"))
//            highestChar = "I";
//
//        int indexOfMax= s.indexOf(highestChar);
//        char highestCharter = highestChar.charAt(0);
//
//        char a[]=s.toCharArray();
//        int sum = hm.get(highestCharter);
//        for(int i=0;i<a.length;i++)
//        {
//           if(i<indexOfMax)
//           {
//               sum =sum - hm.get(a[i]);
//           }
//           if(i>indexOfMax)
//           {
//               sum =sum + hm.get(a[i]);
//           }
//        }
//        return sum;

        int sum=0;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length-1;i++)
        {
            if(hm.get(a[i])<hm.get(a[i+1]))
                sum = sum-hm.get(a[i]);
            else
                sum=sum+hm.get(a[i]);
        }
        return sum+hm.get(a[a.length-1]);
    }
}
