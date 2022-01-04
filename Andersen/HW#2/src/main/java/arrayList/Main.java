package arrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();


        list.add("1");//0
        list.add("2");//1
        list.add("3");//2
        list.add("4");//3



        list.remove(2);

//        list.set(3,45);


//        list.set(65,45);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.get(5));
    }

}
