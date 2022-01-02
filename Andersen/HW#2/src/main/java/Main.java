import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(54);
//        arrayList.remove(2);

        list.add("1");//0
        list.add("2");//1
        list.add("3");//2
        list.add("4");//3
//        list.add("5");//4


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
