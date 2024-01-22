package src.jan20.innerclass;

public class innerclassex {
    public static void main(String[] args) {
        car c=new car("Lamborgini");
        car.engine e=c.new engine(900);
        e.start();
        c.drive();
    }
}
class car
{
    String make;
    public car(String make)
    {
        this.make=make;
    }
    void drive(){
        System.out.println("You can drive");
    }
    class engine{
        int horsepower;
        engine(int horsepower){
            this.horsepower=horsepower;
        }
        void start(){
            System.out.println("engine started"+make+horsepower);
        }
    }
}