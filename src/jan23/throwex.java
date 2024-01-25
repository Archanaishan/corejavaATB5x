package src.jan23;
import java.util.Scanner;
public class throwex {
    //throw will be used at object level
    //throw will be used at method level
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the value of b");
        int b=sc.nextInt();
        extracted(b);
    }

    private static void extracted(int b) {
        if(b==0)
        {
            throw new ArithmeticException("B cannot be zero");
        }
        else{
        int a=10/b;
        System.out.println(a);
    }

}}
