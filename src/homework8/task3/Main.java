package homework8.task3;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Green", 9, 5, 5);
        Rectangle rectangle = new Rectangle("Yellow", 6, 3);
        Triangle triangle = new Triangle("Purple", 11, 8, 5);

        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape shape : shapes) {
            shape.paint();
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println(shape);
            System.out.println();
        }
    }
}
