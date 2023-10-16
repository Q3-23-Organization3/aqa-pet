package homework7.shapes;

import java.util.Objects;

public class Circle extends Shape {
    private String color;
    private int radius;
    private int centerX;
    private int centerY;

    public Circle(String color, int radius, int centerX, int centerY) {
        super(color);
        this.radius = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * (radius * radius));
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    public void paint() {
        System.out.println("The circle is " + getColor());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + getColor() + '\'' +
                ", radius=" + radius +
                ", centerX=" + centerX +
                ", centerY=" + centerY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius && centerX == circle.centerX && centerY == circle.centerY && Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, radius, centerX, centerY);
    }
}
