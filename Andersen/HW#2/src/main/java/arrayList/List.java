package arrayList;

import java.util.Arrays;
import java.util.Collection;

public interface List <E>{
//    //Рзамер массива
//    private static final int CAPACITY = 5;
//    //Инициализация массива
//    private Object[] array = new Object[CAPACITY];
//    //кол-во элементов
//    private int size = 0;
//

    /*
     * получить сумму кол-ва элементов
     */
    public int size();

    /*
     * проверка на пустоту
     */
    public boolean isEmpty();

    /*
     * добавить элемент
     */
    public boolean add(E element);
    /*
     * добавить элемент по индексу
     */
    void add(int index, E element);

    /*
     * Удалить элемент
     */
    boolean remove(Object element);


    /*
     * Удалить элемент по интексу
     */
     E remove(int index);

    /*
     * Отчистить массив
     */
     void clear();

    /*
     * получить элемент по индексу
     */

     E get(int index);

    /*
     * заменить элемент по индексу
     */
     E set(int index, Object element);

    /*
     * Удалить коллекцию
     */
     boolean removeAll(Collection<?> c);

}
