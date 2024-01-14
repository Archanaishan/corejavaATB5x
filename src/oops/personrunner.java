package src.oops;

public class personrunner {
    public static void main(String[] args) {
        person p=new person();//whenevever new is typed new object will be created
        p.name="Archana";
        p.age=35;
        p.salary=100000.00;
        System.out.println(p.name+" "+p.age+" "+p.salary);
        p.sleep();
        p.walk();
        person p2=new person();//new object will be created
        person p3=null;//object will not be created
        new person();//object will be created but without reference
    }
}
