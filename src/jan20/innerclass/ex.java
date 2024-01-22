package src.jan20.innerclass;

import org.w3c.dom.ls.LSOutput;

public class ex {
}
class outer{
    int a=10;
    {
        //System.out.println(b);not possible as b is inner class variable
    }
    class inner{
        int b=20;
        void m1()
        {
            System.out.println(a); //inner classes can access outer class variables.
            // but outer classes cannot access inner class variables
        }

    }
}
