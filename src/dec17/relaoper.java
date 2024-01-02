package src.dec17;

public class relaoper {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(10>=10);
        System.out.println(10<=10);
        System.out.println(10>10);
        System.out.println(10<10);
        System.out.println('A'==65);
        byte b=65;//we can use comparision operatrs in sop.but we cannot use assignment operator
        System.out.println('A'==b);
        System.out.println('A'==6.5f);//the values will be considered as int while using compare operators
    }
}
