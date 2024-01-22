package src.jan20.upcastingdowncasting;

public class casting {
    public static void main(String[] args) {
        hello h=new child();//up casting
        child c1=(child)h;//down casting
    }
}
class hello{}
class child extends hello{

}