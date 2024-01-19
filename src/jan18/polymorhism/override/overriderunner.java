package src.jan18.polymorhism.override;

public class overriderunner {
    //overriding is also called as runtime polymorphism or dynamic dispatch
    public static void main(String[] args) {
    dog d=new dog();
    d.bark();//calls dogs bark method
    hound h=new hound();
    h.bark();//calls hounds bark method
        dog d1=new hound();
        d1.bark();//also calls hounds bark method
}}
