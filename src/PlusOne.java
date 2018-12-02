/**
 * Created by nishita.kheur on 4/3/17.
 */
public class PlusOne {
    public int[] plusOne(int[] digits)
    {
        int b[]=new int[digits.length+1];
        int carry=0;

        for (int i = digits.length - 1; i >=0; i--) {
            int sum=0;
            if(i==digits.length - 1)
            {
                sum = digits[i] + 1;
                b[i + 1] = sum % 10;
                carry = sum / 10;
            }
            else
                sum = digits[i] + carry;
                b[i + 1] = sum % 10;
                carry = sum / 10;
        }
        if(carry==1)
        {
            b[0]=1;
        }
        else
        {
            b[0]=0;
        }
        return b;
    }
}
