package src.oops;

public class constructorrun {
    //constructor is used to create object for the class
    //constructor have same name as class.it is a special method and have no return type.
    //3 types of constructors
    //default,parameterised,copy
    public static void main(String[] args) {
        constructorcl c1=new constructorcl();//whenever this line is executed default constructor will be called'
        c1.printdetails();//default constructor will initialise class attributes with null values so default values
        //will be printed
        constructorcl c2=new constructorcl("archana",35,9486601366l,100000.0);
        //parameterised constructors are used to set values to the class attributes
        c2.printdetails();//the values passed will be printed
    }
}
