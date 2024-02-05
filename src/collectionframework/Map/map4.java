package src.collectionframework.Map;
import java.util.HashMap;
import java.util.Map;
public class map4 {
    public static void main(String[] args) {
        Map <Integer,String> m=new HashMap<>();
        m.put(1,"Mango");
        m.put(2,"Grapes");
        m.put(3,"orange");
        m.put(4,"coconut");
        m.put(1,"pineapple");
        m.remove(4);//to delete a value from the map
        //we can give key value pair also in remove function
        m.putIfAbsent(4,"coconut");//add ifthe key is absent
        //Incase of duplicate key value latest value will be updated
        System.out.println(m);
        for(Map.Entry<Integer,String> e:m.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());
        }
    }
}
