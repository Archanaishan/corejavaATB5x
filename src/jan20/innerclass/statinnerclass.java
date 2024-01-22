package src.jan20.innerclass;

public class statinnerclass {
    public static void main(String[] args) {
        //outer1 obj=new outer1();noo need in case of static inner class
        outer1.sinc objin=new outer1.sinc();
        objin.show();
    }
}
class outer1
{
static int a=10;
int b=20;
static class sinc{
void show()
{
    System.out.println(a);
   // System.out.println(b);only static variables can be accessed inside static class
}
}
}
