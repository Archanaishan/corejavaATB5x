package src.collectionframework.Map;
import java.util.Map;
import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
    Map <String,String> m=new TreeMap<>();
    m.put("Name","Archana");
    m.put("Age","34");
    m.put("babies","2");
    m.put("Qualification","B.E");
    m.put("Occupation","Automation Engineer");
        System.out.println(m);
        //As this is a treemap values will be sorted in natural order
        //similarly if we use Linked has map the values will be in user entered order
        //in hash map there will be no order
}}
