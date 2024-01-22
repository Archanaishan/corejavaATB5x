package src.jan20.interviewques;

public class interfaces {
    public static void main(String[] args) {
        System.out.println(i.a);
        System.out.println(i.b);//we can access variables using interface names as they are static
        //but we cannot access the methods using interface names
        //i.m1();not possible
        A obj=new A();
        obj.m1();//interface methods can be accessed through objects of classes in which they are implemented

    }
}
interface i{
    int a=10;
    int b=20;//all interface varibles are public static by default
    void m1();//but the methods are not public static
}
class A implements i{

    @Override
    public void m1() {
        System.out.println("m1");
    }
}