package src.jan20.wrapperclasses;

public class ex1 {
    public static void main(String[] args) {
        //wrapper classes are usually associated with inbuilt functions
        int x=10;
        //String s=x;not possible
        //String s1=String(x)not possible
        String s1=String.valueOf(x);
        //valueof is a function that converts integer to string
    }
}
