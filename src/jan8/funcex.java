package src.jan8;

public class funcex {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=sum(a,b);//same function name for multiple functions called function overloading
                      // depends on the parameters functions will be called
        int d=sum(a);
        int e=sum();
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    static int sum(int x,int y){
        return x+y;
    }
    static int sum(int x){
        return x+x;
    }
    static int sum(){
        return 99;
    }
}
