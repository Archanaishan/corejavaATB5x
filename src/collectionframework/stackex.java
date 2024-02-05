package src.collectionframework;

import java.util.Stack;

public class stackex {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);
        s.pop();//deletes last inserted element
        System.out.println(s);
        System.out.println(s.peek());//prints top element


    }
}
