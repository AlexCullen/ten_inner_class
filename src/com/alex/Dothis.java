package com.alex;

/**
 * Created by Think on 2017/7/26.
 */
public class Dothis {
    void f(){
        System.out.println("Dothis f()");
    }
    public class Inner{
        public Dothis outer(){
            return Dothis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Dothis dt = new Dothis();
        Dothis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
