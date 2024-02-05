package src.collectionframework.Map;

import java.util.Hashtable;

public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String>ht=new Hashtable<>();
        ht.put(1,"Ishan");
        ht.put(2,"Vivaan");
        System.out.println(ht);
        //hash table legacy class is similar to hash map,The only difference is unlike
        //hashmap hash table doesn't allow null values.
        //also hashtable is synchronized.so threadsafe.
    }
}
