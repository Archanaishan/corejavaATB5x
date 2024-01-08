package src.practiceproblems;
import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        double p,n,r,si;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle");
        p=sc.nextDouble();
        System.out.println("Enter rate");
        r=sc.nextDouble();
        System.out.println("Enter number of years");
        n=sc.nextDouble();
        si=(p*n*r)/100;
        System.out.println("Simple interest is"+si);
    }
}
