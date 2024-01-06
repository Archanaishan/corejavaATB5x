package src.practiceproblems;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        for(int i=2;i<p;i++)
        {
            if(p%i==0){
                System.out.println(p+"Not a prime number");
            break;}
            else
            {   System.out.println(p+"prime number");
            break;}
        }
    }
}
