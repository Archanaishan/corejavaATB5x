package src.jan11;
import java.util.Scanner;
public class stringrev {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        char [] r=n.toCharArray();
        int left=0,right;
        char temp=0;
        right=r.length-1;
        while(left<right){
            temp=r[left];
            r[left]=r[right];
            r[right]=temp;
            left++;
            right--;
        }
        String rev=new String(r);
        System.out.println("Reversed string is" +rev);
    }

}
