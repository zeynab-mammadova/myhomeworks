package az.company.classes.lesson8.FiguresRandomly;

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

public Circle createCircle(){
        return new Circle (createPoint(),createRandom());
}
}
