package src.jan18.blocks;

import src.jan18.blocks.sib;

public class sibrunner {
    public static void main(String[] args) {
        new sib();
        //static intialization block will be called first
        //then iib then default constructor
        sib obj=new sib();
        //iib and default will be called.static will not be called


    }
}
