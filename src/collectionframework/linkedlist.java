package src.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {
        List<String> mylist=new LinkedList<>();
        mylist.add("Archana");
        mylist.add("Devi");
        mylist.add("Quality Engineer");
        Iterator i=mylist.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
