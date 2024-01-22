package src.jan20.interviewques;

public class interface1 {
    public static void main(String[] args) {
      B obj=new B();
      System.out.println(B.a);
      obj.m1();
      obj.say();
      i1 obj1=new B();//interface reference can also be created for class B.
        // object can only be created for concrete class.
      obj1.m1();
      A1 obj2=new B();//class A1 reference also can be created for class B.
        // object can only be created for concrete class.
      obj2.say();
      obj2.m1();
    }
}
interface i1
{
    int a=10;
    void m1();//can only be implemented in a class

}
abstract class A1 implements i1{
    abstract void say();//can be defined only in child class as this is the abstract class
    //interface method m1 can also be defined in abstract class

}
class B extends A1{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    void say() {
        System.out.println("say");
    }
}
