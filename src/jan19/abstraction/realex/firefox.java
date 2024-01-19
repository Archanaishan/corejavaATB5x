package src.jan19.abstraction.realex;

public class firefox extends baseclass{
    @Override
    String openbrowser() {
        System.out.println("Starting");
        return null;
    }

    @Override
    String closebrowser() {
        System.out.println("Ending");
        return null;
    }
}
