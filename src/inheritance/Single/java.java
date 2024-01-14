package src.inheritance.Single;

public class java extends Programming {
    String feature;
    java()
    {
        System.out.println("Java constructor");
    }
    java(String f)
    {
        System.out.println("Param constructor");
        this.feature=f;
    }
    void print()
    {
        System.out.println(this.feature);
    }
}
