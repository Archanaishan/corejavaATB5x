package src.collectionframework;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class sort {
    public static void main(String[] args) {
        List<Integer> mark = new ArrayList<>();
        mark.add(34);
        mark.add(12);
        mark.add(89);
        mark.add(10);
        Collections.sort(mark);
        System.out.println(mark);
    }
}


