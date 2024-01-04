package src.jan4;
import java.util.Scanner;

public class switchex {
    public static void main(String[] args) {
        System.out.println("Enter the browser name firefox,chrome,edge");
        Scanner sc=new Scanner(System.in);
        String browser=sc.nextLine();
        switch(browser.toLowerCase())
        {
            case "firefox":
                System.out.println("firefox");
                break;
            case "chrome":
                System.out.println("chrome");
                break;
            case "edge":
                System.out.println("edge");
                break;
            default:
                System.out.println("Enter correct browser");
        }
    }
}
