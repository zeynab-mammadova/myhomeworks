package az.company.classes.lesson8.FiguresRandomly;

public class Triangle extends Figure {
    Point p1;
    Point p2;
    Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public int Area() {
        return (p1.y - p2.y) * (p2.x - p1.x) / 2;
    }

    public Triangle createTriangle(){
        return new Triangle(createPoint(),createPoint(),createPoint());
    }

}
