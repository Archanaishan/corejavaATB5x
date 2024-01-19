package src.jan18.polymorhism.overload;

import src.jan18.polymorhism.overload.methodoverload;

public class runner {
    public static void main(String[] args) {
        methodoverload obj=new methodoverload();
        float n;
        obj.gift(9);
        obj.gift("archana");
        n=obj.gift(8.0f);
    }
}
