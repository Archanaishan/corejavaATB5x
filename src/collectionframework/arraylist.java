package src.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List mylist=new ArrayList();
        mylist.add("Archana");
        mylist.add("Quality Engineer");
        mylist.add(35);
        mylist.add(100000);
        mylist.add(2023);
        System.out.println(mylist);
        mylist.add(4,2024);
        System.out.println(mylist);
        mylist.remove(5);
        System.out.println(mylist);
        //3 types of iterations are available.Normal
        for (int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
            System.out.println("**************");
            //advanced iteration
            for (Object o:mylist)
                System.out.println(o);
            System.out.println("***********");
            //Iterator
            Iterator it= mylist.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }
}
