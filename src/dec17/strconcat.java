package src.dec17;

public class strconcat {
    public static void main(String[] args) {
        String fname="archana";
        String lname="devi";
        int n1=40;
        int n2=42;
        System.out.println(fname+lname);
        System.out.println(fname+n1+n2);
        System.out.println(n1+n2+fname);//conditions will be executed from
        // left to right so + will be considered as arithmetic operator as long as string encountered
    }

}
