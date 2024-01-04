package src.jan4;

public class switchadv {
    public static void main(String[] args) {
        int a=01;
        switch (a){
        case 01-> System.out.println("a"+a);
            //-> is allowed after jdk1.3.
            // no need of break if we use ->.
            //mulitple case names (labels)are allowed
            //only one statement can be used inside case is we use ->

        case 02,03-> System.out.println("not printed"+a);
        }
    }
}
