package src.inheritance.Single;

import src.inheritance.Single.Programming;
import src.inheritance.Single.java;

public class singinherrun {
    public static void main(String[] args) {
        //java j=new java();//will call programming and java default constructor
        //java j1=new java("oops");//will call Programming default and java parameterised constructor
        //j1.print();
        //Programming p=new Programming();//Will call Programming default constructor
        //Programming p1=new Programming("v1.23","Archana");//will call Programming parameterised constructor
        //p1.printdetails();
        Programming p2=new java();//will call programming and java default constructor
        p2.Auther="Rahul";
        p2.version="12.12";
        p2.printdetails();
        //with p2 we cannot access java attributes and procedure.
        //java j1=new Programming();//is not allowed
       // j.Auther="Java auther";
       // j.version="Java version";//in single inheritance we can access parent features using child class object
        //j.feature="child feature";
        //j.print();
        //j.printdetails();
    }
}
