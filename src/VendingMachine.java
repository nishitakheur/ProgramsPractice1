import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by nishita.kheur on 2/18/17.
 */
public class VendingMachine {

    LinkedBlockingQueue<Integer> Coke = new LinkedBlockingQueue<Integer>();
    LinkedBlockingQueue<Integer> Fanta = new LinkedBlockingQueue<Integer>();
    LinkedBlockingQueue<Integer> Sprite = new LinkedBlockingQueue<Integer>();

    //Cant do .add in class, it has to be inside function

    public void getSoda()
    {
        Coke.add(75750);
        Coke.add(6326);
        Coke.add(98289);
        Fanta.add(6743267);
        Fanta.add(1234);
        Fanta.add(3487);
        Sprite.add(857);
        Sprite.add(5948);
        Sprite.add(143);

        wantSoda("Coke");
        wantSoda("Fanta");
        wantSoda("Sprite");
        wantSoda("Coke");
    }

    public void wantSoda(String str)
    {
        if(str=="Coke")
        {
            System.out.println("You have removed Coke of id:"+Coke.poll());

        }
        if(str=="Fanta")
        {
            System.out.println("You have removed Fanta of id:" + Fanta.poll());

        }
        if(str=="Sprite")
        {
            System.out.println("You have removed Sprite of id:"+Sprite.poll());

        }
    }





}
