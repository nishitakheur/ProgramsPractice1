/**
 * Created by nishita.kheur on 3/2/17.
 */
//Declare array
//int a[]= new int[]{2,3,4,7};
public class Average {
    public float average(int a[])
    {
        float sum =0;
        for(int i=0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        return sum/a.length;
    }
}
