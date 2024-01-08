package src.practiceproblems;
import java.util.Scanner;
public class vowelandcons {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        //System.out.println((a.length()));
        int v=0,c=0;
        for(int i=0;i<a.length();i++)
        {
            //System.out.println(a.charAt(i));
          if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
               v++;
          else
              c++;
        }
        System.out.println("Total vowels are"+v);
        System.out.println("Total consonants are"+c);
    }

}