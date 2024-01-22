package src.jan20.interviewques;

public class abstractex {
    //abstract classes can have both normal and abstract methods
    //abstract methods cannot be implemented in other abstract classes
    //a concrete class can implements methods od parent abstract classes
}
abstract class student{
    abstract void print();
    void normal(){
        System.out.println("normal");
    }
}
abstract class student1 extends student{
    abstract void print1();
}
class teacher extends student1{

    @Override
    void print() {

    }

    @Override
    void print1() {

    }
}
