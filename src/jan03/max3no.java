package src.jan03;

import java.util.Scanner;

public class max3no {
    public static void main(String[] args) {
        System.out.println("Please enter number1");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Please enter number2");
        int b=sc.nextInt();
        System.out.println("Please enter number3");
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a+"is greater");
        }
        else if(b>a&&b>c){
            System.out.println(b+" is greater");
        }
        else {
            System.out.println(c+"is greater");
        }
    }
}
