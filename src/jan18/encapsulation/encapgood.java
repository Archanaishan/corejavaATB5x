package src.jan18.encapsulation;

public class encapgood {

    private String username;//should be private
    private String password;//should be private
    public encapgood(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() //getter and setter should be used for username not for password
    {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    boolean islogin(String uname,String pwd)
    {
        if((this.username.equalsIgnoreCase(uname))&&(this.password.equalsIgnoreCase(pwd) ))
        {
            System.out.println("Logged in");
            return true;
        }
        else{
            System.out.println("Wrong login");
            return false;
        }

    }
}
