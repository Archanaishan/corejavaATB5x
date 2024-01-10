package src.jan8;

public class sumfunc {
    public static void main(String[] args) {

        //write the function outside the main
        //Accessmodifier returntype functionname(paramerters){}
        int a=100;
        int b=200;
        int c=sum(a,b);
        System.out.println(c);
    }
    static int sum(int x,int y){
        int z=x+y;
        return z;// we cannot type any statements after return
    }


}
