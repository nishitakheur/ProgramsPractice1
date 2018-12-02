/**
 * Created by nishita.kheur on 3/1/17.
 */
public class Subsequence {

    //public ABCClass abcclass;
    public int sequenceSum(int a[])
    {

        if(a==null||a.length==0)
        {
            return -1;
        }
        //string foo = abcclass.find();
        int maxChange = 0;
        int maxReturn =0;
        for(int i=0;i<a.length;i++)
        {
            maxChange = maxChange + a[i];
            if(maxChange <0)
            {
                maxChange=0;

            }
            if (maxReturn < maxChange)
            {
                maxReturn=maxChange;
            }

        }
        return maxReturn;

    }
}


//ABCClass mockedABCClass = mock(ABCClass.class);
// when(mockedABCClass.find()).returnValue("foo")


//Subsequence sMock = mock(Subsequence.class);

//assertEquals(-1, sMock.sequenceSum(null));
//int a[2,3,4,5,6]={};
//assertEquals(-1, sMock.sequenceSum(a));
//assertE






