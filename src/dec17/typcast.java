package src.dec17;

public class typcast {
    public static void main(String[] args) {
        byte b=30;
        int a=b;//implicit casting widening
        int d=(int)b;//explicit casting
        int c=129;
        //byte d=c; cannot be done implicit casting cannot be done in narrowing
        int e=(byte)c;//explicit casting narrowing
    }
}
