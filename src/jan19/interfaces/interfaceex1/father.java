package src.jan19.interfaces.interfaceex1;

public interface father {
    void loan1k();//like abstract class this should be implemented in child class
    default void print()//we can have both default and abstract methods in interfaces
    {
        System.out.println("i am default method");
    }
   static void show()
   {
       System.out.println("i am static");
   }
}
