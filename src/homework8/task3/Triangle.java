package homework8.task3;

import java.util.Objects;

public class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(String color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int calculateArea() {
        int s = (sideA + sideB + sideC) / 2;
        return (int) Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public int calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void paint() {
        System.out.println("The triangle is " + getColor());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return sideA == triangle.sideA && sideB == triangle.sideB && sideC == triangle.sideC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }
}
