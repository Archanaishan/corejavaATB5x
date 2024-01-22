package src.jan20;

public class staticdemo {
    public static String name="Archana";
    public int version=4;
    public static void print()
    {
        System.out.println(name);//to access static variable we do not need this keyword
        //System.out.println(version);we cannot access normal instance variables inside static block
    }
    public void prrintout()
    {
        System.out.println(name);
        System.out.println(version);
    }
}
