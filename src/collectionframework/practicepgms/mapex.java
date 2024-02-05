package src.collectionframework.practicepgms;
import java.util.Map;
import java.util.HashMap;

public class mapex {
    //program to find the no of occurences of a word in a sentence
    public static void main(String[] args) {
        Map<String ,Integer> m=new HashMap<>();
        String msg="Hi Archana How are you Archana";
        String[] words=msg.split(" ");
                for(String s:words){
                    Integer count=m.get(s);
                    if(count==null)
                    {
                        m.put(s,1);
                    }
                    else{
                        m.put(s,count+1);
                    }

                }
        System.out.println(m);
    }
}
