package src.jan18.encapsulation;
public class encapgoodrunner {
    public static void main(String[] args) {
        encapgood obj=new encapgood("admin","admin");
        System.out.println(obj.getUsername());//user will not be able to access password as it is private
        obj.islogin("admin","admin");
    }
}

