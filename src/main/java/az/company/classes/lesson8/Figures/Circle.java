package az.company.classes.lesson8.Figures;

public class Circle extends Figure {
    Point p1;
    int radius;

    public Circle(Point p1, int radius) {
        this.p1 = p1;
        this.radius = radius;
    }

    @Override
    public int Area() {
        return 3*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "p1=" + p1 +
                ", radius=" + radius +
                '}';
    }
}
