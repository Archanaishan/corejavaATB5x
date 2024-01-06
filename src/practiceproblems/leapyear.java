package src.practiceproblems;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        long y=sc.nextLong();
        if(y%4==0 && y%100!=0||y%100==0&&y%400==0)
        {
            System.out.println(y+" is a leap year");
        }else{
        System.out.println(y+ "Not a leap year");
    }
}}
