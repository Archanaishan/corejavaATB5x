package src.jan18.encapsulation;

public class encapbadexrunner {
    public static void main(String[] args) {
        encabadex obj=new encabadex("admin","admin");
        obj.password="password";//should not be allowed
        obj.islogin("admin","password");
    }
}
