package src.practiceproblems;
import java.util.Scanner;
public class stringrev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String a=sc.nextLine();
        System.out.println(a.length());
        char[]rev=new char[a.length()];
        int j=0;
        for(int i=a.length()-1;i>=0;i--)
        {rev[j]=a.charAt(i);
        j++;}
        System.out.println(rev);
    }
}
