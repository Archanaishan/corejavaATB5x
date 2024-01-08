package src.practiceproblems;
import java.util. Scanner;

public class palindromenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int p = 0;
        int r, r1;
        int q, q1;
        r = a % 10;
        q = a / 10;
        r1 = q % 10;
        q1 = q / 10;
        p = r * 100 + r1 * 10 + q1;
        if (a == p) {
            System.out.println("reverse of" + a + "is" + p);
            System.out.println("is palindrome");
        } else {
            System.out.println("reverse of" + a + "is" + p);
            System.out.println("not a palindrome");
            //123%10=3
            //123/10=12=12%10=2
            //12/10=1

        }
    }
}