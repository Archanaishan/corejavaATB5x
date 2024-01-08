package src.practiceproblems;
import java.util.Scanner;
public class tempconv {
    public static void main(String[] args) {
        System.out.println("Enter the temp ");
        Scanner sc=new Scanner(System.in);
        Float t=sc.nextFloat();
        System.out.println("Enter the type of conversion :1.f to c 2.c to f");
        int type=sc.nextInt();
        float c,f=0f;
        if(type==1) {
            c = ((t - 32) * 5 / 9);
            System.out.println("Temp in celcius" + c);
        }
        else if(type==2) {
            f = ((9 / 5) * t + 32);
            System.out.println("Temp in farenheit" + f);
        }
        else
            System.out.println("enter ctof or ftoc correctly");
    }
    }

