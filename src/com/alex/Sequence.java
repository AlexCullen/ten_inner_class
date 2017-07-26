package com.alex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 2017/7/26.
 */
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size){
        this.items = new Object[size];
    }
    public void add(Object x){
        if(this.next < this.items.length){
            items[next++] = x;
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        List<Integer> s = new ArrayList<>();
        for(int i=0; i<10; i++){
            sequence.add(i);
            s.add(i);
        }
        int i=0;
        System.out.println(s.get(++i));
        System.out.println(i++);
    }
}
