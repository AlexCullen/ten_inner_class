package com.alex;

/**
 * Created by Think on 2017/7/26.
 */
public class Pracell {
    class Contents{
        private int i =11;
        public int value(){
            return i;
        }
    }

    class Destination{
        private String label;
        Destination(String label){
            this.label = label;
        }
        String readLabel(){
            return label;
        }
    }

    public void ship(String dest){
        Contents c = new Contents();
        Destination d= new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Pracell p = new Pracell();
        p.ship("Tasmania");
    }
}
