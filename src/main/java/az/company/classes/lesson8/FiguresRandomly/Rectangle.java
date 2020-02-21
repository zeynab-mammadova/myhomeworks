package az.company.classes.lesson8.FiguresRandomly;

public class Rectangle extends Figure {
    Point p1;
    Point p2;


    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
public int Area(){
        return (p1.y-p2.y)*(p2.x-p1.x);
}

public Rectangle createRectangle(){
        return new Rectangle(createPoint(),createPoint());
}
}
