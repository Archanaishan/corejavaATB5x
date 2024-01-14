package src.oops;

public class BankAccountrunner {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();//Default constructor
        b1.printdetails();
        BankAccount b2=new BankAccount("HDFC",232323.23,"hdfc005");
        b2.printdetails();//parameterised
        BankAccount b3=new BankAccount("ICICI",232198.23,"icici003");
        b3.bankcode="icici002";//at anytime we can change the value of parameterised constructor
        b3.printdetails();
    }
}
