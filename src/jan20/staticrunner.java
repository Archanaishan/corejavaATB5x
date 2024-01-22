package src.jan20;

public class staticrunner {
    public static void main(String[] args) {
        System.out.println(staticdemo.name);//static variables and static methods can be accessed using class name
        staticdemo.print();//to access we need not to create objects
        staticdemo.name="Archana Devi";//we can change static variable value also in the same way
        staticdemo a=new staticdemo();
        a.version=100;
        a.prrintout();
    }
}
