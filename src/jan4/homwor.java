package src.jan4;
import java.util.Scanner;
public class homwor {
    public static void main(String[] args) {
        //x2+y2+|z|
        System.out.println("Please enter x,y,z");
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        double ans,ans1;
       ans1= Math.pow(x,2)+Math.pow(y,2)-Math.abs(z);
       ans=Math.cbrt(ans1);
        System.out.println(ans);
        sc.close();//we must close the scanner class at the end
    }
}
