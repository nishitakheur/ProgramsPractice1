/**
 * Created by nishita.kheur on 2/27/17.
 */

//See how to create 2d array and pass it!!
public class TicTac {
    public int didWin(int a[][])
    {

        for(int i=0; i<=2;i++ )
       {
           if(a[i][0]!=2&&a[i][1]==a[i][0]&&a[i][2]==a[i][0])
           {
               return a[i][0];
           }
           if(a[0][i]!=2&&a[1][i]==a[0][i]&&a[2][i]==a[0][i])
           {
               return a[0][i];
           }
       }
        if(a[0][0]!=2&&a[1][1]==a[0][0]&&a[2][2]==a[0][0])
        {
            return a[0][0];
        }
        if(a[0][2]!=2&&a[1][1]==a[0][2]&&a[2][0]==a[0][2])
        {
            return a[0][0];
        }
        return 2;
    }
}
