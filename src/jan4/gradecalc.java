package src.jan4;

import java.util.Scanner;

public class gradecalc {
    public static void main(String[] args) {
        System.out.println("Please Enter your mark");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        if (m>=90&&m<=100)
            System.out.println("Grade A");
        else if(m>=80&&m<=89)
            System.out.println("Grade B");
        else if(m>=70&&m<=79)
            System.out.println("Grade C");
        else if(m>=60&&m<=69)
            System.out.println("Grade D");
        else
            System.out.println("Fail");

    }

}
