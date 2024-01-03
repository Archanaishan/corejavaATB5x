package src.jan03;

import java.util.Scanner;

public class ifelseloop {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner a=new Scanner(System.in);
        int n=a.nextInt();
        if(n%2==0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
