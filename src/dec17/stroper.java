package src.dec17;

public class stroper {
    public static void main(String[] args) {
        String name1="archana";//created in string pool
        String name2="archana";//refer name1 .no new name 2 will be created.this is done for memory management.
        String name3=new String("archana");//created in heap area
        String name4=new String("archana");
        String name5=new String("ARCHANA");//created in heap area
        System.out.println(name1==name2);//true
        System.out.println(name3==name4);//false
        System.out.println(name2.equals(name3));//true as equals compares values
        System.out.println(name1.length());//length is counted from 1
        System.out.println(name1.toUpperCase());
        System.out.println(name5.toLowerCase());
    }
}
