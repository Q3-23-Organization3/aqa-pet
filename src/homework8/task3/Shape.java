package homework8.task3;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    protected abstract int calculateArea();

    protected abstract int calculatePerimeter();

    protected abstract void paint();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
