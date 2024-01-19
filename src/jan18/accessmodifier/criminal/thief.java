package src.jan18.accessmodifier.criminal;

import src.jan18.accessmodifier.police.cop;

public class thief {
    public static void main(String[] args) {
        cop obj=new cop(10);//thief shouldn't be able to access police gun
        //System.out.println(obj.gun);
        //obj.canishoot();//can i shoot should be given protected access modifier
    }
}
