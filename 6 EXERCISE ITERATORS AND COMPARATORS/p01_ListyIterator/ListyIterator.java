package p01_ListyIterator;

public class ListyIterator<T> {

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
}
