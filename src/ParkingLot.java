import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by nishita.kheur on 2/18/17.
 */
public class ParkingLot {

    HashMap<Integer,ArrayList<Slot>> parkingLotWhole = new HashMap<Integer,ArrayList<Slot>>();
    Random rand = new Random();
    public void  createParkingLot()
    {
        for(int i=1;i<=6;i++)
        {
            parkingLotWhole.put(i, new ArrayList<Slot>());
        }

       for (int f: parkingLotWhole.keySet())
       {
           for(int n=1; n<=11; n++)
           {
               Boolean state = Math.random()<0.5;
               parkingLotWhole.get(f).add(new Slot(n,state));
           }
       }
      getSlot();
    }


    public void getSlot()
    {
        for (int f: parkingLotWhole.keySet())
        {
            for(Slot sl:parkingLotWhole.get(f))
            {
                if(sl.isEmpty)
                {
                    System.out.println("slot id"+" "+sl.SlotId+" "+"is empty on floor"+" "+f);
                }
            }

        }


    }



}
