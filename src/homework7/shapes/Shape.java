package homework7.shapes;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    protected int calculateArea() {
        return 0;
    }

    protected int calculatePerimeter() {
        return 0;
    }

    public void paint() {
        System.out.println("The shape color is: " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
