package com.alex;

/**
 * Created by Think on 2017/7/26.
 */
public class Pracell2 {
    class Inner{

    }

    public Inner inner(String s){
        return new Inner();
    }

    public static void main(String[] args) {
        Pracell2 pracell2 = new Pracell2();
        pracell2.inner("ssss");
    }
}
