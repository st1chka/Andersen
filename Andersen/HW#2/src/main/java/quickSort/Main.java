package quickSort;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args)  {
        QuickSort<String> quickSort = new QuickSort<>();
        QuickSort<Person> quickSort2 = new QuickSort<>();

//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Арбуз");
//        arrayList.add("Аня");
//
//        Comparator<Character> comparator = new Comparator<Character>() {
//            @Override
//            public int compare(Character o1, Character o2) {
//                return  o1.compareTo(o2);
//            }
//        };
//
//        quickSort.quickSort(arrayList);
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        ArrayList<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person(1));
        arrayList.add(new Person(7));
        arrayList.add(new Person(3));
        arrayList.add(new Person(2));

        for (Person person : arrayList) {
            System.out.println(person);
        }

        quickSort2.quickSort(arrayList);

        for (Person person : arrayList) {
            System.out.println(person);
        }


    }
}
