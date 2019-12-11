import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by nishita.kheur on 2/13/17.
 */
public class MarksNew    {
    public void marksNewSort()
    {
        Student s1 = new Student("Nishita", 98);
        Student s2 = new Student("Nishant", 88);
        Student s3 = new Student("Anna", 68);
        Student s4 = new Student("JB", 78);
        List<Student> l1= new ArrayList<Student>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        l1.add(s4);
        Collections.sort(l1);
        System.out.println("Sorted students are:-");
        for(Student st:l1)
        {
            System.out.println("Sorted students in ascending are:-" + st.name+" "+st.marks);
        }

    }
}
