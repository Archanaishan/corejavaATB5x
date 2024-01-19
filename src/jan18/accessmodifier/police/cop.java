package src.jan18.accessmodifier.police;

public class cop {
    //private can be accessed only inside the block
    //protected can be accessed inside the folder
    protected int gun;
   public cop(int gun)
    {
        this.gun=gun;
    }
    protected void canishoot()
    {
        System.out.println("ofcourse you can");
    }
}
