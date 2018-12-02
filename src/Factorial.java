/**
 * Created by nishita.kheur on 3/2/17.
 */
public class Factorial {
    int fact;
    public int factorial(int n)
    {
//        if(n==0)
//            return 0;
//        if(n==1)
//            return 1;
//        int fact =n;
//        for(int i=1;i<n;i++)
//        {
//            fact =fact*(n-i);
//        }
//        return fact;
        if(n==1)
            return 1;

        fact = n * factorial(n - 1);


        return fact;
    }
}
