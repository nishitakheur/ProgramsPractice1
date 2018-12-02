/**
 * Created by nishita.kheur on 3/26/17.
 */
public class MajorityElement {
    int candidate;
    public void majorityElementMethod(int a[]) {

        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (count == 0)
            {
                candidate = a[i];
                count = 1;
                continue;
            }
            else
            {
                if(candidate==a[i])
                {
                    count++;
                }
                else
                    count--;
            }
        }

        if(count==0)
            System.out.println("Invalid");
        else
        {
            count=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==candidate)
                    count++;
            }
            if(count>a.length/2)
                System.out.print("Majority is"+" "+candidate);
            else
                System.out.print("There is no majority element");
        }
    }
}
