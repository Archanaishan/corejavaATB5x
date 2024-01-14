package src.oops;

import java.sql.SQLOutput;

public class BankAccount {
    String BankName;
    Double balance;
    String bankcode;
    BankAccount(){
        System.out.println("Default Constructor");
        BankName="SBI";
        balance=00000.23;
        bankcode="sbi001";
    }
    BankAccount(String bname,Double bal,String bcode)
    {
        System.out.println("Parameterised constructor");
        this.BankName=bname;
        this.balance=bal;
        this.bankcode=bcode;
    }
    void printdetails()
    {
        System.out.println(this.BankName);
        System.out.println(this.balance);
        System.out.println(this.bankcode);
    }
}
