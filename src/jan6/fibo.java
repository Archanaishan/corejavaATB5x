package src.jan6;
import java.util.Scanner;
public class fibo {
    //n numbers
    //0 to 5
    //0 1 1 2 3 5 8
    public static void main(String[] args) {
        System.out.println("Enter the length of the fibo series");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b);
        for(int i=2;i<n;i++)
        {
          c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
