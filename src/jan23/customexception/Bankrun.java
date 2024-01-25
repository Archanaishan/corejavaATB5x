package src.jan23.customexception;

public class Bankrun {
    public static void main(String[] args) throws CustomException{
        Bank jpchase=new Bank("USD",100);
        Bank HDFC=new Bank("INR",200);
        Bank icici=new Bank("INR",300);
        //System.out.println(HDFC.add(icici));
        System.out.println(HDFC.add(jpchase));
    }
}
