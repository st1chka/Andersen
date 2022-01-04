package quickSort;

import java.util.ArrayList;

public class QuickSort<E>  {


//    public ArrayList<String> quickSort(ArrayList<String> arr) {
//
//        Comparator<Character> comparator = new Comparator<Character>() {
//            @Override
//            public int compare(Character o1, Character o2) {
//                if (o1.length > o2.length) {
//
//                    for (int i = 0; i < o2.length; i++) {
//                        return o1.compareTo(o2[i]);
//
//
//        };
//        ArrayList<String> left = new ArrayList<>();
//        ArrayList<String> middle = new ArrayList<>();
//        ArrayList<String> right = new ArrayList<>();
//
//        char[] firstWord = arr.get(0).toCharArray();
//        char[] secondWord = arr.get(0).toCharArray();
//        for (int i = 0; i < arr.size(); i++) {
//
////            firstWord = arr.get(0).toCharArray();
////            secondWord = arr.get(1).toCharArray();
//
//
//        }
//
//        for (int i = 0; i < arr.size(); i++) {
//            if (firstWord.compareTo(secondWord) == 0) {
//                String word = Character.toString(firstWord);
//                middle.add(firstWord);
//            }
//            if (s.compareTo(base) < 0) {
//                left.add(s);
//            }
//            if (s.compareTo(base) > 0) {
//                right.add(s);
//            }
//        }
//
//
//
//                if (s.compareTo(base) == 0) {
//                    middle.add(s);
//                }
//                if (s.compareTo(base) < 0) {
//                    left.add(s);
//                }
//                if (s.compareTo(base) > 0) {
//                    right.add(s);
//                }
//
//
//        left = quickSort(left);
//        right = quickSort(right);
//
//        left.addAll(middle);
//        left.addAll(right);
//
//        return left;
//
//        return arr;
//    }
//

    public ArrayList<E> quickSort(ArrayList<E> arr) {
        Comparable<ArrayList<E>> comparable = new Comparable<ArrayList<E>>() {

            @Override
            public int compareTo(ArrayList<E> o) {
                return 0;
            }
        };
        E base = arr.get(0);

        ArrayList<E> left = new ArrayList<>();
        ArrayList<E> middle = new ArrayList<>();
        ArrayList<E> right = new ArrayList<>();

        for (E number : arr) {
            if (number.equals(base)) {
                middle.add(number);
            } else if (comparable.compareTo(arr) > 0) {
                left.add(number);
            } else if (comparable.compareTo(arr) < 0) {
                right.add(number);
            }
        }

        left = quickSort(left);
        right = quickSort(right);

        left.addAll(middle);
        left.addAll(right);

        return left;
    }

}
