package src.practiceproblems;
import java.util.Scanner;
public class fact {
    public static void main(String[] args) {
        System.out.println("Enter the number for which fact is to be calculated");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double fact=1;
        while(n>0)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("factorial is"+fact);
        sc.close();
    }

}
