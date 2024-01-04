package src.jan4;
import java.util.Scanner;
public class switchcond {
    public static void main(String[] args) {
        System.out.println("enter number 1-7");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("monday");
                break;//we have to add break to avoid checking other cases.
                     // if current case is true will come out of switch
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Enter no 1-7");
                //break is not needed if default is in last.
                //break is needed if default is the first case

        }
    }
}
