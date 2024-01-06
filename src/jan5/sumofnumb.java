package src.jan5;
import java.util.Scanner;
public class sumofnumb {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n)
        {
            sum=sum+i;
            i++;

        }
        System.out.println("sum"+sum);
    }
}
