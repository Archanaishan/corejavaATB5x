package src.jan22.exception;

public class excep3 {
    public static void main(String[] args) {
        try {
            String s = args[0];//run-> edit configuration to pass arguments
            //ArrayIndexOutOfBoundsException:if no arguments are passed in command line
            Integer x = Integer.parseInt(s);
            //NumberFormatException:If string is passed in command line
            Integer y = 10 / x;
            //ArithmeticException:in case of x=0
            System.out.println(y);
        }
        catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("it will be executed lastly");
        }

    }
}
