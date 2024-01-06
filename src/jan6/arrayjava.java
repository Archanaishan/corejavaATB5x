package src.jan6;

public class arrayjava {
    public static void main(String[] args) {
        int [] a={10,20,30,40};//this is array initialization
        //length of the array is 4
        //index ranges from 0 to 3
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        int [] b=new int[4];//this creates an array with 4 zeros
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        //we can assign values later
        b[0]=20;
        b[1]=30;
        b[2]=40;
        b[3]=30;
        for(int i=0;i<4;i++)
        System.out.println(b[i]);
        b[2]=300;//we can reassign the array values also
        for(int i=0;i<4;i++)
            System.out.println(b[i]);
        final int[]c=new int[4];//here the final fixes the length of the array
        //we can reinitialize and assign values anytime.only thing is we cannot change the length of the array

}}
