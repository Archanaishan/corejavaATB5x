package src.practiceproblems;
import java.util.Scanner;
public class sumofnos {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=0,q=0;
        r=a%10;//1234%10=4
        q=a/10;//1234/10=123
        while(q>10){
            r+=q%10;
            q=q/10;
                    }
        r=r+q;
        System.out.println("Sum of numbers"+r);

    }
}
