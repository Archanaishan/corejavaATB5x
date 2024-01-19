package src.jan19.interfaces.realtimeex;

public class car implements engine,breakmech{
    void start()
    {
        System.out.println("Starting the car");
        breakm();
        startengine();
    }

    @Override
    public void breakm() {
        System.out.println("Breakmechanism is working fine");
    }

    @Override
    public void startengine() {
        System.out.println("Engine started");

    }
}
