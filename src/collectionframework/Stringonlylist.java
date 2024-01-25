package src.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Stringonlylist {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        //<>operator allows you to add the datatype which
        // restricts the user to enter only those datatypes in the List
        mylist.add("Archana");
        mylist.add("Devi S");
        mylist.add("Quality Engineer");
        //mylist.add(35);not allowed as it is an integer
        System.out.println(mylist);
    }
}
