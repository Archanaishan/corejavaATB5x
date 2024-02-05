package src.collectionframework.Map;

import java.util.HashMap;
import java.util.Map;

public class map3 {
    public static void main(String[] args) {
        Map <String,Integer> m=new HashMap();
        m.put("a",100);
        m.put("b",100);
        m.put("c",100);
        m.put("d",100);
        m.remove("d");//to remove a entry
        System.out.println(m);
        for(Map.Entry<String,Integer> e:m.entrySet()){
            System.out.println(e.getKey()+"->"+e.getValue());
        }
    }
}
