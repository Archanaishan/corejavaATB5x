package src.jan11;

public class stringbuildnbuffer {
    public static void main(String[] args) {
        //4 ways of creating strings
        String str1="Archana";//immutable string
        String str2=new String("Devi");//immutable string
        // if the string value is going to change 100 or more times then we should go for mutable strings like
        //string builder and string buffer.
        //if the string value is not going to change the normal immutable strings can be used
        StringBuilder sb=new StringBuilder("Archana");//mutable string
        System.out.println(sb.append("Devi"));//sb will be changed
        StringBuffer sbf=new StringBuffer("Hello");//mutable string
        System.out.println(sbf.append("world"));//sbf will become hello world

        //String builder is not threadsafe whereas string buffer is thread safe.
        //String builder is good and faster in Single threaded environment whereas String buffer
        // is used inmulti threaded environment.
    }
}
