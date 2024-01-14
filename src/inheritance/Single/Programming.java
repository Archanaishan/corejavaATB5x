package src.inheritance.Single;

public class Programming {
    String version;
    String Auther;
    Programming()
    {
        System.out.println("Default constructor");
    }
    Programming(String v,String a){
        System.out.println("Param constructor");
        this.Auther=v;
        this.version=a;
    }
    void printdetails()
    {
        System.out.println(this.Auther);
        System.out.println(this.version);
    }
}
