package src.jan5;

public class continue1 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            System.out.println(i);
            if(i==5)
                continue;//when i==5 loop will continue.next statement will not be executed.
            System.out.println("After");
        }
    }
}
