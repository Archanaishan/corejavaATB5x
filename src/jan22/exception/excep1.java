package src.jan22.exception;

public class excep1 {
    public static void main(String[] args) {
        try{
        String name=null;
        name.trim();//to handle exception we are going to use try catch block.
        System.out.println("Archana");}
        catch(Exception e){
            System.out.println("Null string cannot be trimed");
        }
        System.out.println("the end");
    }

    }

