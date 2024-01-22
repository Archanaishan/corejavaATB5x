package src.jan20.ananymous;

public class ananyex {
    public static void main(String[] args) {
        //anonymous classes will be used in threads
        student s1= new student() {
            //in general, we cannot create object for interfaces.but we can create anonymous class where
            //we can implement interfaces
            @Override
            public void set() {
                System.out.println("set");
            }

        };
        s1.set();
        //we cannot create object for abstract classes.so illr to interface we can create anonymous class
        // for the abstract class
        A obj=new A(){

            @Override
            void abs() {
                System.out.println("m1");
            }
        };

        obj.abs();
    }
}
abstract class A{
    int a=10;
    abstract void abs();
}
interface student{
    int b=20;
    public void set();
}
