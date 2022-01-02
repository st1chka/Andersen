package com.company;

import java.util.ArrayList;

public class Main extends MyArrayList{

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

//        list.add(9);
        list.add(0,8);
//        list.add(6);
        System.out.println(list.get(0));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
