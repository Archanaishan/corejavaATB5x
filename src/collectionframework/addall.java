package src.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class addall {
    public static void main(String[] args) {
        List<String> Courselist=new ArrayList<>();
        //we can create like Arraylist<String> Courselist=new ArrayList<>();also
        Courselist.add("Core Java");
        Courselist.add("Selenium");
        Courselist.add("API");
        Courselist.add("Rest Assured");
        Courselist.add("POSTMAN");
        List numlist=new ArrayList<>();
        //<>inside this we can give only Wrapper classes.Primitive datatypes cannot be given.
        //if <> is not mentioned then the List items will be considered as objects by default.
        numlist.add("100");
        numlist.add("200");
        numlist.add("300");
        numlist.add("400");
        Courselist.addAll(numlist);
        System.out.println(Courselist);
        System.out.println("***********");
        Iterator i=Courselist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("**********");
    }

}
