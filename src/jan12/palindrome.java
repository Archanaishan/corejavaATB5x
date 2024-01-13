package src.jan12;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the String to be checked");
        Scanner sc=new Scanner(System.in);
        StringBuilder str1=new StringBuilder(sc.next());
        //StringBuilder str2=new StringBuilder(str1.reverse());
        System.out.println(str1);
        //System.out.println(str2);
        if((str1.toString()).equals(str1.reverse().toString()))//tostring should always be used with string
            // builder object for comparision.
            System.out.println("The string is palindrome");
        else
            System.out.println("The String is not a palindrome");
    }
}
