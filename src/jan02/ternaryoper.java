package src.jan02;

public class ternaryoper {
    public static void main(String[] args) {
        String str=true?"yes":"No";
        int a=(20>10)?20:10;
        int b=(70>100)?70:100;
        int n1=90;
        int n2=120;
        int n3=240;
        System.out.println("string "+str+"\n"+"a="+a+"\n"+"b="+b);
        //ternary operator (cond)?true:false
        int max=(n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
        System.out.println(max);


    }
}
