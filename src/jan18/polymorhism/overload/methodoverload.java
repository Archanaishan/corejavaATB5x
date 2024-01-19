package src.jan18.polymorhism.overload;

public class methodoverload {

    //multiple methods having same name but differrent parameters is called method overloading
    //this is called compile time polymorphism
    //methods can have different return types also
    void gift(String a)
    {
        System.out.println(a);
    }
    void gift(int a)
    {
        System.out.println(a);
    }
    float gift(float a)
    {
        System.out.println(a);

        return a;
    }
}
