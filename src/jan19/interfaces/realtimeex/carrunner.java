package src.jan19.interfaces.realtimeex;

public class carrunner extends car {
    public static void main(String[] args) {
        carrunner c= new carrunner();
        c.start();//engine and break mechanism is hidden from user.this is called abstraction
    }

}
