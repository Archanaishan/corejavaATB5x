package src.jan4;
import java.util.Scanner;

public class triangleclassify {
    public static void main(String[] args) {
        System.out.println("Please enter the 3 sides of a triangle");
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        if(s1 == s2 && s2== s3)
            System.out.println("Equilateral triangle");
        else if(s1==s2||s2==s3||s3==s1)
            System.out.println("isoscales triangle");
        else
            System.out.println("scalene triangle");

    }
}
