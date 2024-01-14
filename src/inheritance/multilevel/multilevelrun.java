package src.inheritance.multilevel;

public class multilevelrun {
    public static void main(String[] args) {
        grandfather g=new grandfather();
        g.bhk3();//can access only own class contents
        father f=new father();//can access both grandfather and father
        f.bhk2();
        f.bhk3();
        son s=new son();//access son,father,grand father classes
        s.bhk1();
        s.bhk2();
        s.bhk3();
        //son s1=new father();not allowed
        //son s2=new grandfather();//not allowed
        father f1=new son();//acts like a object to father.i.e cann access grandfather and father
        f1.bhk3();
        f1.bhk2();
        //father f2=new grandfather();not allowed
        grandfather g1=new son();//acts like grandfather object.can access only its contents
        g1.bhk3();
        grandfather g2=new father();//acts like grandfather object.can access only its contents
        g1.bhk3();
    }
}
