package src.collectionframework.Map;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class map2 {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"Archana");
        m.put(2,"Devi");
        m.put(3,"Prasanna");
        m.put(4,"Kumar");
        m.put(5,"Ishan");
        m.put(6,"Vivaan");
        m.put(null,"HM");
        m.put(-1,"SAHM");
        System.out.println(m);
        System.out.println(m.get(5));//to retrieve values
        //we can have null nd -1 in key values
        ///Iterator is not supported in Hashmap
        Set a=m.entrySet();//Set has unique values.entry set() will return set view of map elements
        System.out.println(a);
        for(Map.Entry<Integer,String>e:m.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }

    }
}
