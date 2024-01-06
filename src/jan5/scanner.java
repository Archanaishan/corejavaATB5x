package src.jan5;
import java.util.Scanner;//to use scanner
public class scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the name");
        String name=sc.next();//sc.next,sc.nextline will get string input
        System.out.println("Enter your age");
        int age=sc.nextInt();//for integer input
        System.out.println("Enter your Salary");
        double sal=sc.nextDouble();//double input
        System.out.println("Name:"+name+'\n'+"Age:"+age+'\n'+"Salary:"+sal);
        sc.close();//good practice
    }
}
