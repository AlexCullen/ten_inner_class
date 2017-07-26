package com.alex;

import com.interfaces.Contents;
import com.interfaces.Destination;

/**
 * Created by Think on 2017/7/26.
 */
public class Pracell {
    private class PContents implements Contents{
        private int i =11;
        public int value(){
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String label;
        private PDestination(String label){
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Contents getContents(){
        return new PContents();
    }
    public Destination getDestination(String label){
        return new PDestination(label);
    }

//    public void ship(String dest){
//        Contents c = new Contents();
//        Destination d= new Destination(dest);
//        System.out.println(d.readLabel());
//    }

    public static void main(String[] args) {
        Pracell p = new Pracell();
        Contents c = p.getContents();
        Destination d = p.getDestination("Tasmania");
        System.out.println(d.readLabel());
//        p.ship("Tasmania");
    }
}
