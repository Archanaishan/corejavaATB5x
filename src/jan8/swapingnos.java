package src.jan8;

import java.util.Scanner;
public class swapingnos {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);
    }
    public static void swap(int a,int b)
    {
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping A: "+a+" b:= "+b);
    }

}
