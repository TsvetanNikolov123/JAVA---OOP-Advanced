package p09_CustomListIterator;

public interface Sorter<T extends Comparable<T>> {

    void sort(MyList<T> elements);

}
