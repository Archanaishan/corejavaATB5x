package src.jan19.interfaces.interfaceex;

public class I1 {
    public static void main(String[] args) {
        System.out.println(ex.a);//as a is a static variable it can be accessed through class name
    }
}
interface ex
{
    int a=10;//any variable inside inter face will become final static variable
}