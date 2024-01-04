package src.jan4;

public class misc {
    public static void main(String[] args) {
        int a=10;
        char b='a';
        float f=0.9f;
        long l=34;
        switch(a)
        {
            //it is a valid syntax to have empty switch
        }
        switch(b)//int,char,short,byte,string is allowed in switch
        {
        }
        //switch(f){
            //float is not allowed in switch
       // }
        switch((int)l){
            //long is allowed inside switch after type casting
            //double is allowed after type casting
            //boolean is also not allowed in switch
            //same case name for multiple cases is also not allowed
            //multiple case name like case 01,02,03: is allowed in jdk 13
        }
}}
