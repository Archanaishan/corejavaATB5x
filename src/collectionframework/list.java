package src.collectionframework;
import java.util.List;

public class list {
    public static void main(String[] args) {


        List fruits = List.of("orange", "apple", "banana", "guava", "watermelon");
        List marks = List.of(98, 90, 97, 99, 100);
        List details = List.of("Archana", "Software Engineer", 35, 100000);
        //with arrays we cannot store multiple data types.But it is possible with Lists.
        //Arrays also uses fixed memory results is wastage of memory.
        //with list we have many inbuilt functions.
        System.out.println(fruits.get(3));
        System.out.println(marks.size());
        System.out.println(details.indexOf(35));
        System.out.println(fruits.isEmpty());
//List is an inter face.List.of is a static function.So we cannot perform any add or delete with them.
        //so we go for ArrayList or Linked List which are classes that implements List interface.
    }
}