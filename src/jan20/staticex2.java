package src.jan20;

public class staticex2 {
    public static void main(String[] args) {
        c obj=new c();
        c.m2();
        System.out.println(c.b);//we can access static variable b directly using class name.
        obj.m1();
        c obj2=null;
        obj2.m2();//we can access static method using null boject also
    }
}
 class c{
    static
    {
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }
    int a=10;
    static int b=20;
    void m1()
    {
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }
    static void m2()
    {
        System.out.println("m2");
        System.out.println(b);
    }

}
