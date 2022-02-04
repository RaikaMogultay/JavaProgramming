package day44_Interface.ShapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2.5,4.5);
        Square square = new Square(2);
        Circle circle = new Circle(5);

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);


    }
}
