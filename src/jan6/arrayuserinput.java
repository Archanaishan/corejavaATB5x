package src.jan6;
import java.util.Scanner;
public class arrayuserinput {
    public static void main(String[] args) {
        double a []=new double[5];
        System.out.println("Enter marks of 5 subjects");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextDouble();
        }
        System.out.println("Marks of 5 subjects are");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
    }
        sc.close();
}}
