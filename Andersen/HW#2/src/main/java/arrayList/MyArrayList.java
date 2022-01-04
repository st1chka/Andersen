package arrayList;

import java.util.*;

public class MyArrayList<E> implements List<E>, RandomAccess, java.io.Serializable {

    //Рзамер массива
    private static final int CAPACITY = 5;
    //Инициализация массива
    private Object[] array = new Object[CAPACITY];
    //кол-во элементов
    private int size = 0;


    /*
     * получить сумму кол-ва элементов
     */
    @Override
    public int size() {
        return size;
    }

    /*
     * проверка на пустоту
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /*
     * добавить элемент
     */
    @Override
    public boolean add(E element) {
        if (size == array.length) {
            resize(array.length);
        }
        array[size++] = element;
        return true;
    }

    /*
     * добавить элемент по индексу
     */
    @Override
    public void add(int index, E element) {
        if (size == array.length - 1) {
            resize(array.length);
        }
        if (array[index] != null) {
            System.arraycopy(array, index, array, index, array.length - 1 - index);
        }
        array[index] = element;

    }

    /*
     * Удалить элемент
     */
    @Override
    public boolean remove(Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                array[i] = null;
                return true;
            }
        }
        return false;
    }


    /*
     * Удалить элемент по интексу
     */
    @Override
    public E remove(int index) {
        array[index] = 0;
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
            array[array.length - 1] = null;
        }
        return null;
    }

    /*
     * Отчистить массив
     */
    @Override
    public void clear() {
        Arrays.fill(array, null);
    }

    /*
     * получить элемент по индексу
     */
    @Override
    public E get(int index) {
        try {
            return (E) array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    /*
     * заменить элемент по индексу
     */
    @Override
    public E set(int index, Object element) {

        try {
            return (E) (array[index] = element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    /*
     * Удалить коллекцию
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        array = new Object[array.length];
        size = 0;
        return true;
    }

    /*
     * Увеличить массив в 2 раза при заполненности/необзодимости
     */
    private void resize(int length) {
        Object[] newArray = new Object[length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }


    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }


    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public int indexOf(Object element) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object element) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

}