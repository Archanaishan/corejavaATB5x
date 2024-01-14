package src.inheritance.hierarchial;

public class hierarchialrunner {
    public static void main(String[] args) {
        vehicle v1=new vehicle();//access vehicle class contents
        truck t1=new truck();//access both truck and vehicle
        car c1=new car();//access car and vehicle
        //truck t2=new vehicle();not allowed
        //car c2=new vehicle(); not allowed
        //car c3=new truck();not allowed
    }
}
