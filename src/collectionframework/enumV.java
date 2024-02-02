package src.collectionframework;

import java.util.Enumeration;
import java.util.Vector;

public class enumV {
    public static void main(String[] args) {
        Vector v=new Vector<>();
        v.add("Archana");
        v.add("Prasanna");
        v.add("Ishan");
        v.add("Vivaan");
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
