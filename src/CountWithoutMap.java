//1
//111211
public class CountWithoutMap {
    public void countWithoutMap(String a[]){
        if(a.length==0)
        {
            System.out.println("n/a");
        }
        if(a.length==1)
        {
            System.out.println(a[0]+"1");
        }

        int count=1;
        StringBuffer sbfr = new StringBuffer();
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==a[i-1])
            {
                count++;
            }
            else
            {
                sbfr.append(a[i-1]).append(count);
                count=1;
            }

        }

        sbfr.append(a[a.length-1]).append(count);


        System.out.println(sbfr.toString());
    }
}
