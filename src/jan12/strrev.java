package src.jan12;
import com.sun.jdi.Value;

import java.util.Scanner;
public class strrev {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        Boolean result = ispalindrome(s1);
        if (result)
            System.out.println(s1+"is palindrome");
        else
            System.out.println(s1+"is not a palindrome");

    }

    public static boolean ispalindrome(String s1) {
        char[] r = new char[s1.length()];
        int j = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            r[j]=s1.charAt(i);
           j++;
        }
        String rev=String.valueOf(r);//to change char array to string
        System.out.println(rev);
        if(s1.equalsIgnoreCase(rev))
        return true;
        else
            return false;
    }
}
