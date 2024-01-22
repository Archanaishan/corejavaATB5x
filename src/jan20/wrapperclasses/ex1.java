package src.jan20.wrapperclasses;

public class ex1 {
    public static void main(String[] args) {
        //wrapper classes are usually associated with inbuilt functions
        int x=10;
        //String s=x;not possible
        //String s1=String(x)not possible
        String s1=String.valueOf(x);
        //valueof is a function that converts integer to string
        int b=20;
        int c=40;
        Integer B=b;//or
        Integer C=Integer.valueOf(c);
        //in collection framework we usually work with classes.In collection
        // framework we use wrapper classes instead of primitive datatypes
        //because many inbuilt functions are available with wrapper classes ex.below
        C.byteValue();
        //converting wrapper class to primitive datatype is called unboxing ex.below
        Character D='d';
        char d=D;//unboxing


    }
}
