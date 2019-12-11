/**
 * Created by nishita.kheur on 2/27/17.
 */
public class Swap {
    public void swap(int a, int b)
    {
        a = a-b;
        b =a+b;
        a=b-a;
        System.out.println("a="+" "+a);
        System.out.println("b="+" "+b);
    }
}
