package P05_Square;

public class Main {
    public static void main(String[] args) {

        Square sq = new Square();

        Rectangle rectangle = new Square();
        rectangle.setHeight(5);
        rectangle.setWidth(10);

        System.out.println(rectangle.getArea());
    }
}
