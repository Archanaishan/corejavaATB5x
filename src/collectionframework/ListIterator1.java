package src.collectionframework;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ListIterator1 {
    public static void main(String[] args) {
        List course=new ArrayList();
        course.add("JAVA");
        course.add("API");
        course.add("POSTMAN");
        course.add("Selenium");
        //List iterator can be used only with LIST not with map or queue
        //List iterator has the option has previous.

        ListIterator l=course.listIterator(course.size());
        while(l.hasPrevious())
        {
                        System.out.println(l.previous());
        }
        while(l.hasNext())
        {
            //while iterating addition is allowed which is not possible with iterator
            //course.add("AI");
            System.out.println(l.next());
        }


    }
}
