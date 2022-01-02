package com.company;

public class MyArrayList<E> {
    private int size;
    private static final int CAPACITY = 5;

    //    private final int CUT_RATE = 4;
    private Object[] array = new Object[CAPACITY];
    private int extent = 0;

    //Добавляет новый элемент в конец списка.
    void add(E e) {
        if (extent == array.length - 1) {
            resize(array.length * 2);
        }
        array[extent++] = e;
    }

    //Добавляет элемент element в позицию index.
    void add(int index, E e) {
        if (extent == array.length - 1) {
            resize(array.length * 2);
        }

        if (array[index] == null) {
            array[extent++] = e;
        }



    }

    //Возвращает элемент, который расположен в указанной позиции списка.
    public E get(int index) {
        return (E) array[index];
    }

    //Удаляет элемент, который расположен в указанной позиции списка.
    void remove(int index) {
//        array.length-1
    }

    //Возвращает размер листа.
    int size() {
        return extent;
    }

    //Удаление всех элементов из списка.
    void clear() {
        extent = 0;
    }

    //Проверка на наличие элементов в листе
    boolean isEmpty() {
        return extent > 0;
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, extent);
        array = newArray;
    }
}
