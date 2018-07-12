package p11_Threeuple;

public class Threeuple<T, E, F> {

    private T item1;
    private E item2;
    private F item3;

    public Threeuple(T item1, E item2, F item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.item1).append(" -> ").append(this.item2).append(" -> ").append(this.item3);
        return sb.toString();
    }
}
