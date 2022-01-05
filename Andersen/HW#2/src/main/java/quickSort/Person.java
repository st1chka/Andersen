package quickSort;

import java.util.Iterator;
import java.util.ListIterator;

public class  Person implements Comparable<Person>{
    Integer id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int compareTo(Person p) {
        return id.compareTo(p.getId());
    }

}
