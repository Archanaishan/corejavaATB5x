package src.jan8;
import java.util.Scanner;

public class diageleof2darray {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        System.out.println("Enter the array elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The diagonal elements are");
        for(int i=0;i<3;i++){
            System.out.println(a[i][i]);
        }
    }
}
