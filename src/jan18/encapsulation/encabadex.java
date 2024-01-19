package src.jan18.encapsulation;

public class encabadex {

    //encapsulation means bundling of data and methods that operate on data within a single unit or object
    //any changes to the data members should be done through getter and setter.
    public String username;//user should not be able to access these variables.so they should be given as private
    public String password;//user should use getter and setter to access them

    encabadex(String uname,String pwd){
        this.username=uname;
        this.password=pwd;
    }
    boolean islogin(String uname,String pwd)
    {
        if((this.username.equalsIgnoreCase(uname))&&(this.password.equalsIgnoreCase(pwd) ))
        {
        System.out.println("Logged in");
        return true;
    }
        return false;
}
}
