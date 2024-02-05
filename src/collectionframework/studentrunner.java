package src.collectionframework;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class studentrunner {
    public static void main(String[] args) {
        student s1=new student(1,"Archana");
        student s2=new student(4,"Prasanna");
        student s3=new student(3,"Ishan");
        student s4=new student(2,"Vivaan");
        List <student> Students=new ArrayList<>();
        Students.add(s1);
        Students.add(s2);
        Students.add(s3);
        Students.add(s4);
        System.out.println(Students);
        //Since student class has combination of integer and string we cannot use collections.sort
        Collections.sort(Students);
        System.out.println(Students);
        Collections.sort(Students,new sortbyname());
        System.out.println(Students);
    }
}
