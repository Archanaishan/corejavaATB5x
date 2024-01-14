package src.inheritance;

public class singinherrun {
    public static void main(String[] args) {
        java j=new java();//will call programming and java default constructor
        Programming p=new Programming();//Will call Programming default constructor
        Programming p1=new java();//will call programming and java default constructor
        //java j1=new Programming();//is not allowed
        j.Auther="Java auther";
        j.version="Java version";//in single inheritance we can access parent features using child class object
        j.feature="child feature";
        j.print();
        j.printdetails();
    }
}
