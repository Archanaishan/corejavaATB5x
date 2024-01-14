package src.oops;

public class constructorcl {
    String name;
    int age;
    long ph;
    double sal;
    constructorcl()
    {
        System.out.println( "i am default constructor");
    }
    constructorcl(String name,int age,long ph,Double sal)
    {
        this.name=name;
        this.age=age;
        this.ph=ph;
        this.sal=sal;//this refers to the current object
    }
    void printdetails()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println((ph));
        System.out.println((sal));
    }
}
