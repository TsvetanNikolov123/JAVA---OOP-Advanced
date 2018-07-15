package p02_Collection;

import java.util.Iterator;

public class ListyIterator<T> implements Iterable<T> {

    private T[] items;
    private int index;

    public ListyIterator(T... args) {
        this.items = args;
    }

    public boolean move() {
        if (hasNext()) {
            this.index++;
            return true;
        }

        return false;
    }

    public boolean hasNext() {
        if (items != null) {
            return this.index < this.items.length - 1;
        } else {
            return false;
        }
    }

    public void print() {
        if (this.items != null && this.items.length > 0 && this.index < this.items.length) {
            System.out.println(this.items[this.index]);
        } else {
            System.out.println("Invalid Operation!");
        }
    }

    public void printAll() {
        if (this.items != null && this.items.length > 0 && this.index < this.items.length) {
            for (T item : items) {
                System.out.print(item + " ");
            }
        } else {
            System.out.print("Invalid Operation!");
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private final class MyIterator implements Iterator<T> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return counter < items.length;
        }

        @Override
        public T next() {
            return items[counter++];
        }
    }
}
