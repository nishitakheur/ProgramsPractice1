/**
 * Created by nishita.kheur on 3/28/17.
 */
//int a[]={1,4,3,6,7,5};
public class Peak {
    public int PeakElementMethod(int a[])
    {
        if(a==null||a.length==0) //Dont for get tests
            return -1;
        int s=0;
        int e=a.length-1;
        while(s<=e)
        {
            int m=(s+e)/2;
            if(m==0&&a[m+1]>a[m]||a[m-1]<=a[m]&&a[m]<=a[m+1])
            {
                return a[m];
            }

            if(a[m-1]>a[m])
            {
                e=m-1;
            }
            else if(a[m]<a[m+1])
            {
                s=m+1;
            }
        }
        return -1;

    }
}
