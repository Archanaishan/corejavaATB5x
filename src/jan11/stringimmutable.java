package src.jan11;

public class stringimmutable {
    //String immutability means original string remains unchanged.in string pool 3 strings will be there str1
    // ,str2,str3
    public static void main(String[] args) {
        String str1="archana";
        String str2="devi";
        String str3=str1.concat(str2);
        System.out.println(str3);
        str1=str1.concat("prasanna");//original string archana will not be edited.new string archanaprasanna
        //will be created and now str1 will be pointing to that now.
        System.out.println(str3.contains("devi"));
    }
}
