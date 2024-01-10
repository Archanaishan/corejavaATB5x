package src.jan8;
import java.util.Scanner;
public class maxarray {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc= new Scanner(System.in);
        int max=0;
        int size=sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("the array elements are:\n");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
            if(array[i]>max)
                 max=array[i];
                    }
        System.out.println("max of array is"+max);
    }
}
