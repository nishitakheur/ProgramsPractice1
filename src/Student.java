/**
 * Created by nishita.kheur on 2/13/17.
 */
import java.util.*;
public class Student implements Comparable<Student> {

    String name;
    int marks;

    public Student(String name,int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s)
    {
        if(this.marks > s.marks)
            return 1;
        else
            return  -1;

    }
}
