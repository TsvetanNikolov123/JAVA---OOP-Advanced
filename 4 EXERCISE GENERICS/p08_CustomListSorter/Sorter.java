package p08_CustomListSorter;

public interface Sorter<T extends Comparable<T>> {

    void sort(MyList<T> elements);

}
