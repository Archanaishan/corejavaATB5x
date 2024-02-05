package src.collectionframework.Map;
import java.util.HashMap;
import java.util.Map;

public class map1 {
    public static void main(String[] args) {
        Map m=new HashMap();
        m.put("name","Archana");
        m.put("name","Archanadevi");
        System.out.println(m);

        //we can convert map to json and json to map using third party libraries
        // Map should have unique key values.Incase of duplicate values only one will be stored
        //Values can have duplicate values
    }
}
